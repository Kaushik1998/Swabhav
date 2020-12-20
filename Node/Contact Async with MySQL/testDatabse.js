let Mongo = require("./contactMongoDbConnectionService");
let m = new Mongo();

m.getContacts().then(result=>{
  console.log(result);
})