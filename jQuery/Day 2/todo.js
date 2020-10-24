(function () {
  for (let i = 0; i < localStorage.length; i++) {
    const key = localStorage.key(i);
    const value = localStorage.getItem(key);
    const li = document.createElement("li");
    li.classList.add("list-group-item");
    li.innerHTML = key;
    li.setAttribute("onclick", "checkMyStatus(this)");
    // if (value == "undone") {
    //   $("#undone").append(li);
    // } else if (value == "done") {
    //   $("#done").append(li);
    // }
    if (key != "randid") {
      $("#undone").append(li);
    }
  }
})();

$("#insert").click(function (e) {
  e.preventDefault();
  if ($("#task").val()) {
    localStorage.setItem($("#task").val(), "undone");
  }
  location.reload();
});

$("#clear").click(function (e) {
  e.preventDefault();
  localStorage.clear();
  location.reload();
});

const checkMyStatus = (li) => {
  // if (localStorage.getItem(li.innerText) == "undone") {
  //   localStorage.setItem(li.innerText, "done");
  // } else if (localStorage.getItem(li.innerText) == "done") {
  //   localStorage.removeItem(li.innerText);

  localStorage.removeItem(`${li.innerText}`);
  li.remove();
  //}
  location.reload();
  //li.setAttribute("onlick", "removeMe(this)");
  //li.onclick = removeMe(li);
};

// const removeMe = (self) => {
//   localStorage.removeItem(self.innerHTML);
//   self.remove();
// };
