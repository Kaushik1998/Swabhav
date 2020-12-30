let Database = require("../services/Mongoose/contactMongooseConnectionService");
let Contact = require("../services/Mongoose/contactSchema");
const fs = require("fs");
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
    console.log("searchContact Req Body", req.body);
    this.db
      .searchContact(req.body)
      .then((result) => {
        console.log(result);
        res.status(200).send(result);
      })
      .catch((err) => {
        res.status(404).send(err);
      });
  };

  deleteContact = (req, res, next) => {
    this.db
      .deleteContact(req.body._id)
      .then((result) => {
        console.log(result);
        res.status(200).send(result);
      })
      .catch((err) => {
        res.status(400).send(err);
      });
  };

  parseContact = (req, res, next) => {
    for (let property in req.body) {
      req.body[property] = JSON.parse(req.body[property]);
    }
    // console.log(" processUpdateContact Parsed Data", req.body);
    next();
  };

  parseImage = (req, res, next) => {
    if (req.files[0]) {
      req.body.profilePicture = {
        data: req.files[0].buffer,
        contentType: req.files[0].mimetype,
      };
    }
    console.log("parsed Req Body Pic", req.body.profilePicture);
    next();
  };

  updateContact = (req, res, next) => {
    let id = req.body._id;
    delete req.body._id;
    console.log("Final Req Body", req.body);
    this.db
      .updateContact(id, req.body)
      .then((result) => {
        console.log("Final result", result);
        res.status(200).send(result);
      })
      .catch((err) => {
        console.log("In Controller updateContact Error", err);
        res.status(400).send(err);
      });
  };
};
