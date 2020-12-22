let Database = require("../services/Mongoose/contactMongooseConnectionService");
let Contact = require("../services/Mongoose/contactSchema");
module.exports = class Controller {
  constructor() {
    this.db = new Database();
  }

  getContacts = (req, res, next) => {
    this.db.getContacts().then((result) => {
      res.status(200).send(result);
    });
  };

  addContact = (req, res, next) => {
    this.db
      .addContact(new Contact(req.body))
      .then((result) => {
        res.status(200).send(result);
      })
      .catch((err) => {
        res.status(400).send(err);
      });
  };

  searchContact = (req, res, next) => {
    this.db
      .searchContact(req.query)
      .then((result) => {
        res.status(200).send(result);
      })
      .catch((err) => {
        res.status(404).send(err);
      });
  };
};
