(function () {
  for (let i = 0; i < localStorage.length; i++) {
    const key = localStorage.key(i);
    const value = localStorage.getItem(key);
    const li = document.createElement("li");
    li.innerHTML = key;
    li.setAttribute("onclick", "checkMe(this)");
    if (value == "undone") {
      $("#undone").append(li);
    } else if (value == "done") {
      $("#done").append(li);
    }
  }
})();

$("#insert").click(function (e) {
  e.preventDefault();
  localStorage.setItem($("#task").val(), "undone");
  location.reload();
});

$("#clear").click(function (e) {
  e.preventDefault();
  localStorage.clear();
  location.reload();
});

const checkMe = (li) => {
  localStorage.setItem(li.innerHTML, "done");
  location.reload();
};
