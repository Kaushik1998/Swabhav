$("#red").click(function (e) { 
    e.preventDefault();
    $("#red").css("background-color", "blue");
    $("#red").css("color", "red");
    $("body").css("background-color", "red");
    $("#blue").css("background-color", "blue");
    $("#blue").css("color", "white");
});

$("#blue").click(function (e) { 
    e.preventDefault();
    $("#blue").css("background-color", "red");
    $("#blue").css("color", "blue");
    $("body").css("background-color", "blue");
    $("#red").css("background-color", "red");
    $("#red").css("color", "white");
});