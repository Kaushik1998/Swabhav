// let count = 0;
// const button = document.querySelector("button");
// const h1 = document.querySelector("h1");

// button.onclick = function () {
//   let count = localStorage.getItem("count");
//   count++;
//   h1.innerHTML = count;
//   localStorage.setItem("count", count);
//   console.log(localStorage.getItem("count"));
// };

(function () {
  document.querySelector("h1").innerHTML = localStorage.getItem("count");
})();

