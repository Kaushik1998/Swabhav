$("#colors").change(function (e) {
  e.preventDefault();
  let color = $("#colors option:selected").text();
  $("body").css("background-color", color);
  $("#colors").css("color", color);
  $("label").css("color", color);
});


