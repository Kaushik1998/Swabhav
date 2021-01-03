const bodyParser = require("body-parser");
const express = require("express");
const path = require("path");
const app = express();
const port = 4000 || process.env.PORT;
const multer = require("multer");

let storage = multer.memoryStorage();
let upload = multer({ storage });

app.use(bodyParser.json({ limit: "5mb" }));
app.use(bodyParser.urlencoded({ limit: "5mb", extended: true }));
app.use("/", express.static(path.join(__dirname, "public")));

const Controller = require("./controller/mongooseController");
const controller = new Controller();

app.get("/", (req, res, next) => {
  res.sendFile(path.join(__dirname + "/public/index.html"));
});

app.get("/api/contacts", controller.getContacts);
app.post("/api/contacts/search", controller.searchContact);

app.post(
  "/api/contacts/add",
  upload.any(),
  controller.parseContact,
  controller.parseImage,
  controller.addContact
);
app.post(
  "/api/contacts/update",
  upload.any(),
  controller.parseContact,
  controller.parseImage,
  controller.updateContact
);

app.delete("/api/contacts", controller.deleteContact);

app.listen(port, () => {
  console.log(`App listening at http://localhost:${port}/`);
});
