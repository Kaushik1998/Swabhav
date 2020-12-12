const express = require("express");
const app = express();
const path = require("path");
const port = 2000 || process.env.PORT;
const swaggerJsDoc = require("swagger-jsdoc"); 
const swaggerUi = require("swagger-ui-express");

const swaggerOptions = {
  swaggerDefinition: {
    info: {
      version: "1.0.0",
      title: "Contact API",
      description: "Contact API Information",
      contact: {
        name: "Kaushik Nippanikar",
      },
      servers: [`http://localhost:${port}`],
    },
  },
  apis: ["server.js"],
};

const swaggerDocs = swaggerJsDoc(swaggerOptions);
app.use("/api-docs", swaggerUi.serve, swaggerUi.setup(swaggerDocs));

function reqestDetails(req, res, next) {
  console.log(`Hostname : ${req.hostname}`);
  console.log(`IP Address : ${req.ip}`);
  next();
}

function timeOfReq(req, res, next) {
  console.log("Time of req is " + new Date());
  next();
}

function authenticate(req, res, next) {
  console.log("This middleware is tring to authenticate User");
  next();
}

let contacts = [
  { name: "Kaushik", id: 1 },
  { name: "Jayant", id: 2 },
  { name: "Paras", id: 3 },
  { name: "Shailesh", id: 4 },
  { name: "Pawan", id: 5 },
];

app.get("/", function (req, res, next) {
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

/**
 * @swagger
 * /contacts:
 *  get:
 *    description: Use to request all contacts
 *    response:
 *     '200':
 *        description: A successful response
 */
app.get("/contacts", (req, res) => {
  // res.send(contacts);
  res.send([
    {
      id: 1,
      title: "Harry Potter",
    },
  ]);
});

/**
 * @swagger
 * /contacts/{id}:
 *  get:
 *    description: use to request contact on specific ID
 *    parameters:
 *        in : path
 *        id : id
 *        type : number
 *        required : true
 *    response:
 *     '200':
 *        description: A successful response
 */
app.get("/contacts/:id", (req, res, next) => {
  res.send(
    contacts.find((contact) => {
      return contact.id == req.params.id;
    })
  );
});

app.listen(port, function () {
  console.log(`Example app listening on port http://localhost:${port}/`);
});
