let Mongo = require("./contactMongoDbConnectionService");
let m = new Mongo();

let n = {
  name: "Kaushik",
  contact: 8779395779,
  address: ["Malad", "Mumbai"],
};
// m.addContact(n);
// m.getContacts().then((r) => console.log(r));
console.log(m.clearTable());
