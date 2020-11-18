function function1() {
  console.log("This is function 1");
}

let function2 = () => {
  console.log("This is function 2");
};

function1();
function2();

setTimeout(() => {
  console.log("This will execute in 3 Seconds");
}, 3000);
