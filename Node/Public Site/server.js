const express = require("express");
const app = express();
const path = require("path");
const swaggerJsDoc = require("swagger-jsdoc");
const swaggerUi = require("swagger-ui-express");

const swaggerOptions = {
  swaggerDefinition: {
    info: {
      version: "1.0.0",
      title: "Public API",
      description: "Public API Information",
      contact: {
        name: "Kaushik Nippanikar",
      },
      servers: [`http://localhost:${port}`],
    },
  },
  // ['.routes/*.js']
  apis: ["server.js"],
};

const swaggerDocs = swaggerJsDoc(swaggerOptions);
app.use("/api-docs", swaggerUi.serve, swaggerUi.setup(swaggerDocs));

const port = process.env.PORT || 5000;

//Routes
/**
 * @swagger
 * /:
 *  get:
 *    description: Homepage
 *    responses:
 *      '200':
 *        description: A successful response
 */
app.get("/", function (req, res) {
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
 * /public/:file:
 *    get:
 *      description: Use to get a specific file
 *    parameters:
 *      - in : path
 *        file : id
 *        type : string
 *        required : true
 *    responses:
 *      '200':
 *        description: File found
 *      '304':
 *        description: Same file
 */
app.get("/public/:file", function (req, res, next) {
  let options = {
    root: path.join(__dirname, "assets", "public"),
  };
  res.sendFile(req.params.file, options, function (err) {
    if (err) {
      next(err);
    } else {
      console.log("Sent:");
    }
  });
});

app.use(function (req, res, next) {
  res.status(404).send("Page not found");
});

app.listen(port, function () {
  console.log(`Example app listening on port http://localhost:${port}/`);
});
