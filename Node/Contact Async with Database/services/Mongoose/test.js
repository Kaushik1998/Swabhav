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

m.deleteContact({
  _id: "5fe37a53eb9788261832c75e",
})
  .then((res) => console.log(res))
  .catch((err) => console.log(err));

m.updateContact("5fe3660feb9788261832c75c", {
  name: {
    firstName: "Night",
  },
  address: {
    city: "Goa",
    state: "Goa",
  },
  profilePicture: {
    data: fs.readFileSync(
      path.join(__dirname + "/uploads/" + req.file.filename)
    ),
    contentType: "image/png",
  },
});
//   .then((res) => console.log(res))
//   .catch((err) => console.log(err));

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
