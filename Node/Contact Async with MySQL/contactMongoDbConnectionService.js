const url = `mongodb+srv://root:root@cluster0.iyeol.mongodb.net/<dbname>?retryWrites=true&w=majority`;
const { MongoClient } = require("mongodb");

module.exports = class MongoDBService {
  url = `mongodb+srv://root:root@cluster0.iyeol.mongodb.net/<dbname>?retryWrites=true&w=majority`;
  collection = null;
  constructor() {}

  async startConnection() {
    let collection = null;
    await MongoClient.connect(url, {
      useUnifiedTopology: true,
    }).then((client) => {
      this.database = client.db("Swabhav");
      collection = this.database.collection("Student");
    });
    return collection;
  }

  async getContacts() {
    this.collection = this.collection || (await this.startConnection());
    let contacts = null;
    await this.collection
      .find()
      .toArray()
      .then((results) => {
        contacts = results;
      })
      .catch((error) => console.error(error));
    return contacts;
  }

  addContact = (name, contact) => {
  };
};
