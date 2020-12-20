let Database = require("./contactSQLDatabaseConnectionService");

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
    let name = req.body.name;
    let contact = req.body.contact;
    if (name && contact) {
      this.db
        .addContact(name, contact)
        .then((result) => {
          let id = result["insertId"];
          res.status(200).send({ id });
        })
        .catch((err) => {
          console.log("Throwing error");
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
