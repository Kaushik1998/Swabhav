const images = document.querySelector(".images");
const h1 = document.querySelector("h1");
const h2 = document.querySelector("h2");
const h3 = document.querySelector("h3");
let count = 0;
let random = Math.floor(Math.random() * 47);
let imgArray = [];
h1.innerText = random;
for (let i = 0; i < 50; i++) {
  imgArray[i] = document.createElement("img");
  imgArray[i].setAttribute("src", "grey.png");
  imgArray[i].setAttribute("alt", "Grey Ball");
  if (i == random) {
    imgArray[i].setAttribute("onclick", "blue(this)");
  } else {
    imgArray[i].setAttribute("onclick", "wrong(this)");
  }
  imgArray[i].classList.add("grey");
  images.appendChild(imgArray[i]);
}

function blue(tag) {
  tag.setAttribute("src", "blue.jpg");
  h2.innerHTML = "Blue Button";
  h3.innerHTML = "You picked : " + imgArray.indexOf(tag);
}

function wrong(tag) {
  if (count < 5) {
    h2.innerHTML = "Wrong Button";
    h3.innerHTML = "You picked : " + imgArray.indexOf(tag);
    count++;
  } else {
    h2.innerHTML = "Your exhausted your tries";
  }
}

function yellow(tag) {
  if (count < 5) {
    tag.setAttribute("src", "yellow.png");
    h2.innerHTML = "Yellow Button";
    h3.innerHTML = "You picked : " + imgArray.indexOf(tag);
  } else {
    h2.innerHTML = "Your exhausted your tries";
  }
}

function green(tag) {
  if (count < 5) {
    tag.setAttribute("src", "green.png");
    h2.innerHTML = "Green Button";
    h3.innerHTML = "You picked : " + imgArray.indexOf(tag);
  } else {
    h2.innerHTML = "Your exhausted your tries";
  }
}

(function () {
  imgArray[random - 1].setAttribute("onclick", "yellow(this)");
  imgArray[random + 1].setAttribute("onclick", "green(this)");
})();
