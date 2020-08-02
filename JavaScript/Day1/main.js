function changeColor(color) {
  document.getElementById("pingJS").style.backgroundColor = color;
  if (color === "blue") {
    document.getElementById("redButton").style.backgroundColor = "red";
    document.getElementById("blueButton").style.backgroundColor = "red";
  } else {
    document.getElementById("redButton").style.backgroundColor = "blue";
    document.getElementById("blueButton").style.backgroundColor = "blue";
  }
  //document.body.style.backgroundColor = color;
}

function updateColour() {
  let color = document.getElementById("color").value;
  document.getElementById("pingJS").style.backgroundColor = color;
}
