function function1() {
    console.log("This is function 1");
}
var function2 = function () {
    console.log("This is function 2");
};
function1();
function2();
setTimeout(function () {
    console.log("This will execute in 3 Seconds");
}, 3000);
