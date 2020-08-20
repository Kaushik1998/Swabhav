let date = new Date($.now());
// $(document).ready(function () {
//   $("#date").html(`Date is: ${date.getDate()}    Month : ${date.getMonth()}     Year :${date.getFullYear()}`);
//   $("#time").html(`Time is : ${date.getHours()}`);
// });

$(document).ready(function () {
  $("#date").html(date);
  $("#date").animate(
    {
      opacity: 0.25,
      left: "+=50",
      height: "toggle",
    },
    5000,
    function () {
      // Animation complete.
    }
  );

  $("#hello").animate(
    {
      opacity: 0.25,
      left: "+=50",
      height: "toggle",
    },
    5000,
    function () {
      // Animation complete.
    }
  );
});
