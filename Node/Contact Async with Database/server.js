const bodyParser = require("body-parser");
const express = require("express");
const path = require("path");
const app = express();
const port = 4000 || process.env.PORT;
const multer = require("multer");

// let storage = multer.diskStorage({
//   destination: "./uploads/",

//   filename: function (req, file, callback) {
//     callback(
//       null,
//       file.originalname.replace(path.extname(file.originalname), "") +
//         path.extname(file.originalname)
//     );
//   },
// });
let storage = multer.memoryStorage();
let upload = multer({ storage });

// app.use(bodyParser.urlencoded({ extended: true }));
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
// app.post("/api/contacts", upload.single("file"), controller.addContact);
app.post(
  "/api/updateContact",
  upload.any(),
  function (req, res, next) {
    console.log("Req Body", req.body);
    console.log("Req File", req.files);
    next();
  },
  controller.processUpdateContact,
  controller.processUpdateImage,
  controller.updateContact
);
app.put("/api/contacts", controller.updateContact);
app.delete("/api/contacts", controller.deleteContact);

app.listen(port, () => {
  console.log(`App listening at http://localhost:${port}/`);
});
