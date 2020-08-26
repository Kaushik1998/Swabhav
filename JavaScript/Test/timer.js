const startTimeout = document.getElementById("startTimeout");
const stopTimeout = document.getElementById("stopTimeout");
const startInterval = document.getElementById("startInterval");
const stopInterval = document.getElementById("stopInterval");

let timeout;
let interval;

startInterval.onclick = function () {
  alert("Hello");
  interval = setInterval(myTimer, 1000);
};

stopInterval.onclick = function () {
  clearInterval(interval);
};

startTimeout.onclick = function () {
  alert("Hello");
  timeout = setTimeout(myTimer, 1000);
};

stopTimeout.onclick = function () {
  clearTimeout(timeout);
};

function myTimer() {
  var d = new Date();
  document.getElementById("demo").innerHTML = d.toLocaleTimeString();
}
