const removeMe = (tag) => {
  localStorage.removeItem(tag);
};

(function () {
  for (let i = 0; i < localStorage.length; i++) {
    let li = document.createElement("li");
    let button = document.createElement("button");
    button.innerText = "Remove";
    li.setAttribute("onclick", "checkMyStatus(this)");
    let key = localStorage.key(i);
    let value = localStorage.getItem(key);
    console.log(value);
    button.onclick = removeMe(li);
    $(li).append(`${key}: ${moment(value, "YYYY-MM-DD HH:mm:SS").fromNow()}`);
    $(li).append(button);
    if (key != "randid") {
      $("#undone").append(li);
    }
  }
})();

$("#insert").click(function (e) {
  e.preventDefault();
  if ($("#task").val()) {
    localStorage.setItem(
      $("#task").val(),
      moment().format("YYYY-MM-DD HH:mm:SS")
    );
  }
  location.reload();
});

$("#clear").click(function (e) {
  e.preventDefault();
  localStorage.clear();
  location.reload();
});

const checkMyStatus = (self) => {
  const text = self.innerText;
  const colon = text.indexOf(":");
  const key = text.substring(0, colon);
  const time = text.substring(colon + 1, text.length);
  alert(`The task ${key} will be removed which is ${time} old`);
  localStorage.removeItem(key);
  location.reload();
};
