var result = (function () {
  return {
    setData: function () {
      let data = localStorage.getItem("number");
      console.log(data);
      if (data) {
        $("#number").text(data);
        $("#timeAgo").html(
          `Updated : ${moment(
            localStorage.getItem("time"),
            "YYYY-MM-DD HH:mm:SS"
          ).fromNow()}`
        );
      }
    },
  };
})();

$("#button").click(function (e) {
  e.preventDefault();
  let number = $("#inputNumber").val();
  if (number) {
    $.ajax({
      type: "get",
      url: `http://numbersapi.com/${number}`,
      dataType: "text",
      success: function (response) {
        localStorage.setItem("number", response);
        localStorage.setItem("time", moment().format("YYYY-MM-DD HH:mm:SS"));
        result.setData();
      },
    });
  }
});
