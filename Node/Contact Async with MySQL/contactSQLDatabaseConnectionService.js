const mysql = require("mysql");

module.exports = class ContactDatabaseConnectionService {
  username = "root";
  password = "root";
  databaseName = "Contact";
  tableName = "Contacts";

  constructor() {
    this.startConnection();
  }

  getContacts() {
    let promise = new Promise((resolve, reject) => {
      let query = `SELECT * FROM ${this.tableName}`;
      this.con.query(query, function (err, result) {
        if (err) reject(err);
        resolve(result);
      });
    });
    return promise;
  }

  getContactById(id) {
    return new Promise((resolve, reject) => {
      let query = `SELECT * FROM ${this.tableName} WHERE id = ?`;
      this.con.query(query, [id], function (err, result) {
        if (err) reject(err);
        if (!result.length) {
          reject(`No entry for ID : ${id}`);
        }
        if (result) {
          resolve(result);
        }
      });
    });
  }

  getContactByNumber(number) {
    return new Promise((resolve, reject) => {
      let query = `SELECT * FROM ${this.tableName} WHERE number = ?`;
      this.con.query(query, [number], function (err, result) {
        if (err) reject(err);
        if (!result) throw new Error(`No entry for ID : ${number}`);
        resolve(result);
      });
    });
  }

  addContact(newContact) {
    let promise = new Promise((resolve, reject) => {
      let query = `INSERT INTO Contacts (name, number) VALUES (?, ?)`;
      this.con.query(query, [newContact.name, newContact.contact], function (err, result) {
        if (err) reject(err);
        resolve(result);
      });
    });
    return promise;
  }

  startConnection() {
    let databaseName = this.databaseName;
    this.con = mysql.createConnection({
      host: "localhost",
      user: this.username,
      password: this.password,
      database: this.databaseName,
    });
    this.con.query(`USE ${this.databaseName}`, function (err, result) {
      if (err) throw err;
      console.log(`Using database ${databaseName}`);
    });
  }

  clearTable() {
    return new Promise((resolve, reject) => {
      this.con.query(`DELETE FROM ${this.tableName}`, function (err, result) {
        if (err) reject(err);
        resolve(result);
      });
    });
  }
};

class Singleton {
  constructor() {
    if (!Singleton.instance) {
      Singleton.instance = new ContactDatabaseConnectionService();
    }
  }

  getInstance() {
    return Singleton.instance;
  }
}
