const bodyParser = require("body-parser");
const express = require("express");
const path = require("path");
const app = express();
const port = 4000 || process.env.PORT;

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));
app.use("/", express.static(path.join(__dirname, "public")));

const Controller = require("./controller/mongooseController");
const controller = new Controller();

app.get("/", (req, res, next) => {
  res.sendFile(path.join(__dirname + "/public/index.html"));
});

app.get("/api/contacts", controller.getContacts);
app.get("/api/searchContacts", controller.searchContact);
// app.get("/api/contacts/:id", controller.getContactById);
// app.get("/api/clear", controller.clearTable);
app.post("/api/contacts", controller.addContact);
app.put("/api/contacts", controller.updateContact);
app.delete("/api/contacts", controller.deleteContact);

app.listen(port, () => {
  console.log(`App listening at http://localhost:${port}/`);
});
