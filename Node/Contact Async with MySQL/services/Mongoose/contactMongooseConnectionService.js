const mongoose = require("mongoose");
const url = `mongodb+srv://root:root@cluster0.iyeol.mongodb.net/ContactDb?retryWrites=true&w=majority`;

module.exports = class Mongoose {
  constructor() {
    this.startConnection();
  }

  addContact = (contact) => {
    return new Promise((resolve, reject) => {
      contact.save(function (err, result) {
        if (err) reject(err);
        resolve(result);
      });
    });
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
