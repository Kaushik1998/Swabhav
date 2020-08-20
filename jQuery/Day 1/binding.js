$("#color").on("input", function () {
  $("#para").css("background-color", $(color).val());
});

$("#font").on("input", function () {
  $("#para").css("font-size", `${$("#font").val()}px`);
});

$("#fcolor").on("input", function () {
    $("#para").css("color", $("#fcolor").val());
});

$(selector).attr(attributeName);
