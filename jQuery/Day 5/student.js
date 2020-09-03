const table = document.getElementById("table");
const reload = document.getElementById("reload");
const add = document.getElementById("add");
const overlay = document.getElementById("overlay");
const postButton = document.getElementById("post");
const closeButton = document.getElementById("close");
let interval;

$(closeButton).click(function (e) {
  e.preventDefault();
  document.getElementById("overlay").style.display = "none";
});

$(postButton).click(function (e) {
  e.preventDefault();

  let name = $("#name").val();
  let age = $("#age").val();
  let rollno = $("#rollno").val();
  let email = $("#email").val();
  let male;
  if ($("#male").val() == "on") {
    male = true;
  }

  let date = moment().format("yyyy-MM-DD");

  let userData = new data(name, age, rollno, email, male, date);

  $.ajax({
    type: "POST",
    url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/",
    data: userData,
    dataType: "JSON",
    success: function (response) {
      alert(`Your ID for submiited request \n ${response}`);
    },
  });
});

$(add).click(function (e) {
  e.preventDefault();
  overlay.style.display = "flex";
  overlay.style.alignItems = "center";
  overlay.style.justifyContent = "center";
});

const ajju = () => {
  $.ajax({
    type: "get",
    url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/",
    dataType: "json",
    success: function (response) {
      let index = 1;
      response.forEach((element) => {
        let tr = document.createElement("tr");
        $(tr).append(getTh(index++));
        $(tr).append(getTd(element["name"]));
        $(tr).append(getTd(element["id"]));
        $(tr).append(getTd(element["age"]));
        $(tr).append(getTd(element["email"]));
        $(tr).append(getTd(element["rollNo"]));
        $(tr).append(getTd(element["date"]));
        $(tr).append(getTd(element["isMale"]));
        $(table).append(tr);
      });
    },
  });
};
$(reload).click(function (e) {
  e.preventDefault();
  ajju();
});

function getTd(data) {
  let td = document.createElement("td");
  if (data) {
    $(td).text(data);
  } else {
    $(td).text("-");
  }
  return td;
}

function getTh(index) {
  let th = document.createElement("th");
  th.innerText = index;
  $(th).attr("scope", "row");
  return th;
}

function getTr(index, data) {
  let tr = document.createElement("tr");
  $(tr).append(getTh(index));
  data.forEach((element) => {
    $(tr).append(element);
  });
  return tr;
}

$(document).ready(function () {
  ajju();
  interval = setInterval(function () {
    ajju();
  }, 10000);
});

function data(name, age, rollno, email, isMale, date) {
  return { name, age, rollno, email, isMale, date };
}
