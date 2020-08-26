let count = 0;
const button = document.querySelector("button");
const h1 = document.querySelector("h1");

button.onclick = function () {
  let count = sessionStorage.getItem("count");
  count++;
  h1.innerHTML = count;
  sessionStorage.setItem("count", count);
  console.log(sessionStorage.getItem("count"));
};
