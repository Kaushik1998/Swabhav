function getData() {
  var d = Math.floor(Math.random() * 10);
  if (d > 5) {
    return { data: d };
  } else {
    return { msg: "Error! No. is less than 5" };
  }
}
var result = getData();
setTimeout(function () {
  console.log(result);
}, 0);
console.log("End of Script!");
