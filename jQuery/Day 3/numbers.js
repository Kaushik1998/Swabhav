$("button").click(function (e) {
  e.preventDefault();
    if($("#inputNumber").val()){
        $.get(`http://numbersapi.com/${$("#inputNumber").val()}`, function (data) {
            $("#number").text(data);
          });
    }
    $("#number").css("animation-play-state", "running");
});

$("#number").css("--animate-duration", "2s");
