module.exports = class UserController {
  register = (req, res) => {
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
  };
};
