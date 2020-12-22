const mongoose = require("mongoose");
const Contact = require("./contactSchema");
const url = `mongodb+srv://root:root@cluster0.iyeol.mongodb.net/ContactDb?retryWrites=true&w=majority`;

module.exports = class Mongoose {
  constructor() {
    this.startConnection();
  }

  addContact = (contact) => {
    return contact.save();
  };

  async getContacts() {
    return await Contact.find({}, "-address._id");
  }

  async searchContact(getContact) {
    return await Contact.find(getContact);
  }
  startConnection = () => {
    mongoose.connect(
      url,
      {
        useNewUrlParser: true,
        useUnifiedTopology: true,
        useCreateIndex: true,
        useFindAndModify: false,
      },
      function (err) {
        if (err) throw err;
      }
    );
  };
};
