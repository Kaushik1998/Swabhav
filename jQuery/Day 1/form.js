const username = "abc";
const password = "abc";
$("#passwordmsg").css("color", "red");
$("#usermsg").css("color", "red");
$("button").click(function (e) {
  e.preventDefault();
  let u = $("#user").val();
  let p = $("#password").val();
  if (!u) {
    $("h1").html(``);
    $("#usermsg").html("Username not entered");
  }
  if (u != username) {
    $("h1").html(``);
    $("#usermsg").html("Username not proper");
  }

  if (!p) {
    $("h1").html(``);
    $("#passwordmsg").html("Password not entered");
  }

  if (p != password) {
    $("h1").html(``);
    $("#passwordmsg").html("Password not proper");
  }
  if (u != username) {
    $("h1").html(``);
    $("#usermsg").html("Username not proper");
  }
  if (!(u && p)) {
    $("#usermsg").html("Username not entered");
    $("#passwordmsg").html("Password not entered");
  } else if (p == password && u == username) {
    $("h1").html(`Welcome ${u} `);
    $("#usermsg").html("");
    $("#passwordmsg").html("");
  }
});
