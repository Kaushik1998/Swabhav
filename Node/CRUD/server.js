const express = require("express");
const app = express();
const path = require("path");

const swaggerJSDoc = require("swagger-jsdoc");
const swaggerUI = require("swagger-ui-express");
const swaggerOptions = {
  definition: {
    info: {
      title: "Contact Management API",
      version: "1.0.0",
      description: "Contact API for contact management",
      contact: {
        name: "Kaushik Nippanikar",
      },
      servers: [`contactController.js`],
    },
  },
  apis: ["server.js"],
};
const swaggerDocs = swaggerJSDoc(swaggerOptions);
app.use("/api-docs", swaggerUI.serve, swaggerUI.setup(swaggerDocs));

const port = 2500 || process.env.PORT;

app.get("/", function (req, res) {
  res.sendFile(path.join(__dirname + "/index.html"));
});

app.use("/contact", require("./contactController"));

app.listen(port, () => {
  console.log(`Server running ar port http://localhost:${port}/`);
});

/**
 *  @swagger
 *   /contact/{id}:
 *     get:
 *       summary: Retrieve a particular id of Contacts
 *       description: Gets a Conatct by id
 *       parameters:
 *         - in: path
 *           name: id
 *           type: integer
 *           required: true
 *       responses:
 *         "200":
 *           description: Success
 */

/**
 * @swagger
 * definitions:
 *  Contact:
 *   type: object
 *   required:
 *    - id
 *    - name
 *   properties:
 *    name:
 *     type: string
 *    id:
 *     type: integer
 */

/**
 * @swagger
 * /contact:
 *   get:
 *     summary: Retrieve a list of Contacts
 *     description: Retrieve a list of contact from Memory Repo
 *     produces:
 *      - application/json
 *     responses:
 *       200:
 *         description: A list of contacts.
 *         schema:
 *           type: array
 *           items:
 *             $ref: '#/definitions/Contact'
 */

/**
 * @swagger
 *
 * /contact:
 *   post:
 *     summary: This Create a New Contact
 *     description: Creates a Contact
 *     produces:
 *       - application/json
 *     parameters:
 *       - name: contact
 *         description: contact object
 *         in:  body
 *         required: true
 *         type: string
 *         schema:
 *           $ref: '#/definitions/nContact'
 *     responses:
 *       200:
 *         description: Contacts
 *         schema:
 *           $ref: '#/definitions/Contact'
 */
