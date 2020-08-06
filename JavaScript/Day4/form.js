const p = document.querySelector("p");
const myText = document.getElementById("myText");
const fonts = document.getElementById("font");
const bgColor = document.getElementById("bgColor");
const frColor = document.getElementById("frColor");
function update() {
  p.innerHTML = myText.value;
  p.style.fontSize = `${fonts.value}vh`;
  p.style.backgroundColor = `${bgColor.value}`;
  p.style.color = `${frColor.value}`;
}
