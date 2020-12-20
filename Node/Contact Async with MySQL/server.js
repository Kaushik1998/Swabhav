const bodyParser = require("body-parser");
const express = require("express");
const path = require("path");
const app = express();
const port = 4000 || process.env.PORT;

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));
app.use('/', express.static(path.join(__dirname, 'public')))

const ContactController = require("./contactController");
const controller = new ContactController();

app.get("/", (req, res, next) => {
  res.sendFile(path.join(__dirname + "/public/index.html"));
});

app.get("/contacts", controller.getContacts);
app.get("/contacts/:id", controller.getContactById);
app.get("/clear", controller.clearTable);
app.post("/contacts", controller.addContact);

app.listen(port, () => {
  console.log(`App listening at http://localhost:${port}/`);
});
