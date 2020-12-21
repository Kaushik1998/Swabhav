// let Database = require("./contactSQLDatabaseConnectionService");
let Database = require("./contactMongoDbConnectionService");

module.exports = class ContactController {
  constructor() {
    this.db = new Database();
  }

  getContacts = (req, res, next) => {
    this.db.getContacts().then((result) => {
      res.status(200).send(result);
    });
  };

  getContactById = (req, res, next) => {
    this.db
      .getContactById(req.params.id)
      .then((result) => {
        res.status(200).send(result);
      })
      .catch((err) => {
        res.status(404).send(err);
      });
  };

  getContactByName = (req, res, next) => {
    this.db
      .getContactById(req.params.name)
      .then((result) => {
        res.status(200).send(result);
      })
      .catch((err) => {
        res.status(400).send(err);
      });
  };

  addContact = (req, res, next) => {
    let { name, contact, address } = req.query;
    if (name && contact && address) {
      this.db
        .addContact({ name, contact, address })
        .then((result) => {
          let id = result["insertId"];
          res.status(200).send({ id });
        })
        .catch((err) => {
          res.status(400).send(err);
        });
    }
  };

  clearTable = (req, res, next) => {
    this.db
      .clearTable()
      .then((result) => {
        res.status(200).send(result);
      })
      .catch((err) => {
        res.status(400).send(err);
      });
  };
};
