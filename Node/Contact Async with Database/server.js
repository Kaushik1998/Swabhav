const bodyParser = require("body-parser");
const express = require("express");
const path = require("path");
const app = express();
const multer = require("multer");
const cookieParser = require("cookie-parser");
const session = require("express-session");
const sessionChecker = require("./middleware/session-checker");
const User = require("./models/userSchema");

const storage = multer.memoryStorage();
const upload = multer({ storage });
const port = 3000 || process.env.PORT;

app.use(bodyParser.json({ limit: "5mb" }));
app.use(bodyParser.urlencoded({ limit: "5mb", extended: true }));
app.use("/", express.static(path.join(__dirname, "public")));
app.use(bodyParser.urlencoded({ extended: true }));
app.use(cookieParser());
app.use(
  session({
    key: "user_sid",
    secret: "secret_key",
    resave: false,
    saveUninitialized: false,
    cookie: {
      expires: 1000 * 60 * 5, //5 minutes
    },
  })
);
app.use((req, res, next) => {
  if (req.cookies.user_sid && !req.session.user) {
    res.clearCookie("user_sid");
  }
  next();
});

const ContactController = require("./controller/mongooseController");
const contactController = new ContactController();
const UserController = require("./controller/userController");

app
  .route("/register")
  .get(sessionChecker, (req, res) => {
    res.sendFile(__dirname + "/public/register.html");
  })
  .post((req, res) => {
    var user = new User({
      username: req.body.username,
      email: req.body.email,
      password: req.body.password,
    });
    user.save((err, result) => {
      if (err) {
        res.redirect("/home");
      } else {
        console.log(result);
        req.session.user = result;
        res.redirect("/home");
      }
    });
  });
app
  .route("/login")
  .get(sessionChecker, (req, res) => {
    res.sendFile(__dirname + "/public/login.html");
  })
  .post(async (req, res) => {
    let username = req.body.username,
      password = req.body.password;

    try {
      let user = await User.findOne({ username: username }).exec();
      if (!user) {
        res.redirect("/login");
      }
      user.comparePassword(password, (error, match) => {
        if (!match) {
          res.redirect("/login");
        }
      });
      req.session.user = user;
      res.redirect("/home");
    } catch (error) {
      console.log(error);
    }
  });

app.get("/logout", (req, res) => {
  if (req.session.user && req.cookies.user_sid) {
    res.clearCookie("user_sid");
    res.redirect("/");
  } else {
    res.redirect("/");
  }
});

app.get("/home", (req, res, next) => {
  if (req.session.user && req.cookies.user_sid) {
    res.sendFile(__dirname + "/public/home.html");
  } else {
    res.redirect("/");
  }
});
app.get("/api/contacts", contactController.getContacts);
app.post("/api/contacts/search", contactController.searchContact);

app.post(
  "/api/contacts/add",
  upload.any(),
  contactController.parseContact,
  contactController.parseImage,
  contactController.addContact
);
app.post(
  "/api/contacts/update",
  upload.any(),
  contactController.parseContact,
  contactController.parseImage,
  contactController.updateContact
);

app.delete("/api/contacts", contactController.deleteContact);

app.listen(port, () => {
  console.log(`App listening at http://localhost:${port}/`);
});
