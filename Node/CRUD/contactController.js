const express = require("express");
const app = express();
const bodyParser = require("body-parser");

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
const ContactService = require("./contactService");
let c = new ContactService();

app.get("/", (req, res, next) => {
  res.send(c.getContacts());
});

app.get("/:id", (req, res, next) => {
  res.setHeader("Content-Type", "application/json");
  res.send(c.findContactWithID(req.params.id));
});


app.post("/", (req, res, next) => {
  c.addContact(req.body.name, req.body.id);
  res.send(201);
});

module.exports = app;
