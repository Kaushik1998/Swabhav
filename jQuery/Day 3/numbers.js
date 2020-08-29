let setData = (function () {
  $("#number").text(localStorage.getItem("number"));
  $("#timeAgo").append(
    moment(localStorage.getItem("time"), "YYYY-MM-DD HH:mm:SS").fromNow()
  );
  console.log(
    moment(localStorage.getItem("time"), "YYYY-MM-DD HH:mm:SS").fromNow()
  );
})();

$("button").click(function (e) {
  e.preventDefault();
  if ($("#inputNumber").val()) {
    $.get(`http://numbersapi.com/${$("#inputNumber").val()}`, function (data) {
      localStorage.setItem("number", data);
      localStorage.setItem("time", moment().format("YYYY-MM-DD HH:mm:SS"));
      $("#number").text(localStorage.getItem("number"));
      location.reload();
    });
  }
});
