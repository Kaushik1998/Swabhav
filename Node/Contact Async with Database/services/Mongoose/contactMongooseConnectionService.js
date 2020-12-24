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

  getContacts = async () => {
    return await Contact.find({}, "-address._id");
  };

  searchContact = async (getContact) => {
    return await Contact.find(getContact);
  };

  updateContact = async (contactId, contactUpdate) => {
    return await Contact.findByIdAndUpdate(contactId, contactUpdate);
  };

  deleteContact = async (contactId) => {
    return await Contact.findByIdAndDelete(contactId);
  };
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
