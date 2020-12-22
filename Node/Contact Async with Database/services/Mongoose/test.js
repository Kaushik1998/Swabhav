let Mongo = require("./contactMongooseConnectionService");
let Contact = require("./contactSchema");

let kaushik = new Contact({
  name: {
    firstName: "Kaushik",
  },
  address: {
    city: "Mumbai",
    state: "Maharastra",
  },
});

let m = new Mongo();

m.addContact({
  name: {
    firstName: "Kaushik",
  },
  address: {
    city: "Mumbai",
    state: "Maharastra",
  },
})
  .then((res) => console.log(res))
  .catch((err) => console.log(err));
