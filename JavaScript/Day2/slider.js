let inputTag = document.querySelector("input"),
  h1Tag = document.querySelector("h1");

h1Tag.innerHTML = inputTag.value;
inputTag.addEventListener(
  "input",
  function () {
    h1Tag.innerHTML = `Your Number is ${inputTag.value}`;
  },
  false
);

function addButton() {
  let buttonElement = document.querySelector(".buttons");
  buttonElement.remove();

  let newButtonElement = document.createElement("div");
  newButtonElement.setAttribute("class", "buttons");
  document.body.appendChild(newButtonElement);
  for (let i = 0; i < inputTag.value; i++) {
    let button = document.createElement("button");
    button.innerText = i;
    newButtonElement.appendChild(button);
  }
}
