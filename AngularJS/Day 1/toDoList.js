const tbody = document.querySelector("tbody");
const task = document.getElementById("task");
let taskNumber = 1;
let tasks = [];

let app = angular.module("todo", []);
app.controller("myctrl", function ($scope) {
  $scope.addTask = () => {
    let taskName = task.value;
    localStorage.setItem(
      taskNumber++,
      JSON.stringify(getNewTrElement(taskName))
    );
    //tbody.appendChild(getNewTrElement(taskName));
  };
});

function getNewTrElement(task) {
  let tr = document.createElement("tr");

  let checkbox = document.createElement("input");
  checkbox.setAttribute("type", "checkbox");
  $(checkbox).change(function (e) {
    e.preventDefault();
    if (checkbox.checked) {
      console.log("true");
      $(taskTd).css({ "text-decoration": "line-through" });
      dateTd.innerText = moment().format("dddd, MMMM Do YYYY, h:mm:ss a");
    } else {
      $(taskTd).css({ "text-decoration": "none" });
      dateTd.innerText = "-";
    }
  });

  let taskTd = document.createElement("p");
  taskTd.innerText = task;

  let dateTd = document.createElement("p");
  dateTd.innerText = "-";

  let button = document.createElement("button");
  button.innerText = "Remove";
  button.classList.add("btn", "btn-danger");
  button.onclick = () => {
    tr.remove();
  };

  tr.appendChild(getNewTdElement(checkbox));
  tr.appendChild(getNewTdElement(taskTd));
  tr.appendChild(getNewTdElement(dateTd));
  tr.appendChild(getNewTdElement(button));

  return tr;
}

function getNewTdElement(element) {
  let td = document.createElement("td");
  td.appendChild(element);
  return td;
}
