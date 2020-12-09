const express = require("express");
const app = express();
const pug = require("pug");
const path = require("path");
const bodyParser = require("body-parser");

const compiledFunction = pug.compileFile("template.pug");

app.use(bodyParser.urlencoded({ extended: true }));

app.get("/", (req, res) => {
  let options = {
    root: path.join(__dirname),
  };

  res.sendFile("index.html", options, function (err) {
    if (err) {
      next(err);
    } else {
      console.log("Sent index.html");
    }
  });
});

app.get("/auth.pug", (req, res) => {
  console.log(req.query);
  let responseFile = compiledFunction({
    fname: req.query.fname,
    lname: req.query.lname,
  });
  res.send(responseFile);
});

app.post("/auth.pug", (req, res) => {
  console.log(req.body);
  let responseFile = compiledFunction({
    fname: req.body.fname,
    lname: req.body.lname,
  });
  res.send(responseFile);
});

app.listen(3000, function () {
  console.log("Example app listening on port http://localhost:3000/");
});
