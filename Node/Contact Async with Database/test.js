// var { MongoClient, ObjectID } = require("mongodb");
// var url = `mongodb+srv://root:root@cluster0.iyeol.mongodb.net/<dbname>?retryWrites=true&w=majority`;

// MongoClient.connect(url, { useUnifiedTopology: true }, function (err, client) {
//   if (err) throw err;
//   let database = client.db("Swabhav");
//   let collection = database.collection("Student");
//   collection.findOne(
//     { _id: new ObjectID(`5fd9a32b36ef560ef4556994`) },
//     (err, res) => {
//       if (err) throw err;
//       console.log(res);
//     }
//   );
// });

function test() {
  return new Promise((resolve, reject) => {
    resolve(1);
  });
}

let c = test().then((res) => {
  return res;
});

console.log(typeof JSON.parse("8779395779"));
