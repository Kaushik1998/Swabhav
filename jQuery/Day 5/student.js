const table = document.getElementById("table");
const reloadNavbarButton = document.getElementById("reload");
const addNavbarButton = document.getElementById("add");
const addOverlay = document.getElementById("addOverlay");
const updateOverlayPostButton = document.getElementById("post");
const closeAddOverlay = document.getElementById("close");
const deleteNavbarButton = document.getElementById("deleteNavbarButton");
const deleteOverlay = document.getElementById("deleteOverlay");
const deleteOverlayDeleteButton = document.getElementById(
  "deleteOverlayDeleteButton"
);
const updateNavbarButton = document.getElementById("updateNavbarButton");
const updateOverlay = document.getElementById("updateOverlay");
const updateOverlayPutButton = document.getElementById(
  "updateOverlayPutButton"
);
const updateOverlayCloseButton = document.getElementById(
  "updateOverlayCloseButton"
);
let studentData;
let interval;

function customJSONtoSend(name, age, rollno, email, isMale, date) {
  return { name, age, rollno, email, isMale, date };
}

$(updateOverlayPutButton).click(function (e) {
  e.preventDefault();
  let id = $("#updateOverlayID").val();
  let name = $("#updateOverlayName").val();
  let age = $("#updateOverlayAge").val();
  let rollno = $("#updateOverlayRollno").val();
  let email = $("#updateOverlayEmail").val();
  let male;
  if ($("#updateOverlayMale").val() == "on") {
    male = true;
  }

  let date = moment().format("yyyy-MM-DD");

  let userData = new customJSONtoSend(name, age, rollno, email, male, date);
  userData["id"] = id;
  $.ajax({
    type: "PUT",
    url: `http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/${id}`,
    data: userData,
    success: function () {
      alert(`ID : ${id}\nhas been updated.`);
    },
  });
});

$(updateNavbarButton).click(function (e) {
  e.preventDefault();
  updateOverlay.classList.add("show");
  updateOverlay.classList.remove("hide");
});

$(updateOverlayCloseButton).click(function (e) {
  e.preventDefault();
  updateOverlay.classList.add("hide");
  updateOverlay.classList.remove("show");
});

$(deleteOverlayDeleteButton).click(function (e) {
  e.preventDefault();
  let deleteID = $("#deleteID").val();
  $.ajax({
    type: "Delete",
    url: `http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/${deleteID}`,
    success: function () {
      alert(`ID : ${deleteID} \nhas been deleted`);
      ajaxCallToAPI();
    },
  });
  deleteOverlay.classList.add("hide");
  deleteOverlay.classList.remove("show");
});

$(deleteNavbarButton).click(function (e) {
  e.preventDefault();
  deleteOverlay.classList.add("show");
  deleteOverlay.classList.remove("hide");
});

$(closeAddOverlay).click(function (e) {
  e.preventDefault();
  addOverlay.classList.remove("show");
  addOverlay.classList.add("hide");
});

$(updateOverlayPostButton).click(function (e) {
  e.preventDefault();
  closeAddOverlay.click();
  let name = $("#name").val();
  let age = $("#age").val();
  let rollno = $("#rollno").val();
  let email = $("#email").val();
  let male;
  if ($("#male").val() == "on") {
    male = true;
  }

  let date = moment().format("yyyy-MM-DD");

  let userData = new customJSONtoSend(name, age, rollno, email, male, date);

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

$(addNavbarButton).click(function (e) {
  e.preventDefault();
  addOverlay.classList.remove("hide");
  addOverlay.classList.add("show");
});

const ajaxCallToAPI = () => {
  $.ajax({
    type: "get",
    url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/",
    dataType: "json",
    success: function (response) {
      table.innerHTML = null;
      studentData = response;
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
$(reloadNavbarButton).click(function (e) {
  e.preventDefault();
  ajaxCallToAPI();
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

function closeAllOtherOverlay(closeElement) {
  let closeElements = [closeAddOverlay];

  for (element in closeElements) {
    element.click();
  }
}

$(document).ready(function () {
  ajaxCallToAPI();
  interval = setInterval(function () {
    ajaxCallToAPI();
  }, 10000);
});

