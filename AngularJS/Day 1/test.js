let task = document.getElementById("task");
let button = document.querySelector("button");
let tbody = document.querySelector("tbody");
button.onclick = () => {
  let p = document.createElement("p");
  p.innerText = task.value;
  let td = getNewTdElement(p);
  console.log(JSON.stringify(td));
  //localStorage.setItem(task.value, JSON.stringify(td));
};
function getNewTdElement(element) {
  let td = document.createElement("td");
  td.appendChild(element);
  return td;
}

(function addTogether() {
  for (let i = 0; i < localStorage.length; i++) {
    let key = localStorage.key(i);
    $("tbody").append(localStorage.getItem(key));
  }
})();

let app = angular.module("testapp", []);
app.controller("testctrl", function ($scope) {});
