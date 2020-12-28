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
    this.db
      .searchContact(req.body)
      .then((result) => {
        res.status(200).send(result);
      })
      .catch((err) => {
        res.status(404).send(err);
      });
  };

  processUpdateContact = (req, res, next) => {
    if (req.body) {
      req._id = req.body._id;
      delete req.body.id;
      req.contact = req.body;
    } else {
      res.status(400).send("No Body of Contact");
    }
    next();
  };

  processUpdateImage = (req, res, next) => {
    // if (req.file) {
    //   let img = fs.readFileSync(req.file.path);
    //   let encode_image = img.toString("base64");
    //   let finalImg = {
    //     contentType: req.file.mimetype,
    //     image: new Buffer.from(encode_image, "base64"),
    //   };
    //   req.contact.profilePicture = {
    //     data: finalImg.image,
    //     contentType: finalImg.contentType,
    //   };
    // }
    if (req.files) {
      req.contact.profilePicture = req.files[0].buffer;
      req.contact.contentType = req.files[0].mimetype;
    }
    console.log("Buffer", req.contact.profilePicture);
    next();
  };

  updateContact = (req, res, next) => {
    this.db
      .updateContact(req._id, req.contact)
      .then((result) => {
        console.log("Controller result", result);
        res.status(200).send(result);
      })
      .catch((err) => {
        console.log("Controller Err", err);
        res.status(400).send(err);
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
};
