let Mongo = require("./contactMongooseConnectionService");
let Contact = require("./contactSchema");

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

m.updateContact("5fe3660feb9788261832c75c", 
{
  name: {
    firstName: "Night",
  },
  address: {
    city: "Goa",
    state: "Goa",
  },
}
)
  .then((res) => console.log(res))
  .catch((err) => console.log(err));

// m.addContact({
//   name: {
//     firstName: "Kaushik",
//   },
//   address: {
//     city: "Mumbai",
//     state: "Maharastra",
//   },
// })
//   .then((res) => console.log(res))
//   .catch((err) => console.log(err));
