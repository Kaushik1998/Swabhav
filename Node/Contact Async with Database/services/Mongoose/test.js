let Mongo = require("./contactMongooseConnectionService");
let Contact = require("./contactSchema");
let path = require("path");
let fs = require("fs");

let kaushik = new Contact({
  name: {
    firstName: "Ksn",
  },
  address: {
    city: "Karnataka",
    state: "Maharastra",
  },
});

let m = new Mongo();
m.searchContact({
  name: {
    firstName: "Kaushik",
  },
})
  .then((res) => console.log(res))
  .catch((err) => console.log(err));

//   .then((res) => console.log(res))
//   .catch((err) => console.log(err));
