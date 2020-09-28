const tbody = document.querySelector("tbody");
const task = document.getElementById("task");
let taskNumber = 1;

let app = angular.module("todo", []);
app.controller("todoctrl", function ($scope) {
  $scope.localData = () => {
    let myLocalStorage = [];
    for (let i = 0; i < localStorage.length; i++) {
      if (localStorage.key(i) != "randid") {
        let obj = {
          key: localStorage.key(i),
          value: JSON.parse(localStorage.key(i)),
        };
        myLocalStorage.push(obj);
      }
    }
    return myLocalStorage;
  };
  $scope.addTask = () => {
    let taskName = $(task).val();
    let objectString = JSON.stringify(getObject(taskName));
    console.log(objectString);
    localStorage.setItem(taskNumber++, objectString);
  };
  $scope.getNewTrElement = (object) => {
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
    taskTd.innerText = object["taskName"];

    let dateTd = document.createElement("p");
    dateTd.innerText = object["date"];

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
  };
  $scope.getTd = () => {};
});

function getObject(taskName) {
  return {
    taskName,
    date: moment().format("dddd, MMMM Do YYYY, h:mm:ss a"),
  };
}

let test = {
  id: 1,
  data: "now",
};
console.log(JSON.stringify(test));
// "{\"id\":1,\"data\":\"now\"}"
