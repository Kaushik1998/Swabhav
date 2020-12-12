module.exports = class ContactService {
  constructor() {
    this.contacts = require("./contactRepository");
  }
  getContacts() {
    return this.contacts;
  }

  addContact(name, id) {
    this.contacts.push({ name, id });
  }

  findContactWithID(id) {
    return this.contacts.find((contact) => {
      return contact.id == id;
    });
  }

  findContactWithName(name) {
    return this.contacts.find((contact) => {
      return contact.name == name;
    });
  }
};
