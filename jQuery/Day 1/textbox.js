$("button").click(function (e) {
  e.preventDefault();
  $("p").html(`Hello ${$("#name").val()}`);
});
