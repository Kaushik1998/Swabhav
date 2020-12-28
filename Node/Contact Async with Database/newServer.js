const bodyParser = require("body-parser");
const express = require("express");
const path = require("path");
const app = express();
const port = 4000 || process.env.PORT;
const multer = require("multer");

app.use(bodyParser.json({ limit: "50mb" }));
app.use(bodyParser.urlencoded({ limit: "50mb", extended: true }));
app.use("/", express.static(path.join(__dirname, "public")));

const Controller = require("./controller/mongooseController");
const controller = new Controller();

app.get("/", (req, res, next) => {
  res.sendFile(path.join(__dirname + "/public/index.html"));
});

app.get("/api/contacts", controller.getContacts);
app.get("/api/searchContacts", controller.searchContact);
