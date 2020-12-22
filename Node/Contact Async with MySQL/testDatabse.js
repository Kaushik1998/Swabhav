let Mongo = require("./contactMongoDbConnectionService");
let m = new Mongo();

let n = {
  name: "New Await",
  contact: 1113,
  address: ["Japan", "Bangkok"],
};
m.addContact(n).then((res) => console.log(res));
// m.getContacts().then((r) => console.log(r));
