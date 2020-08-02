function myModule() {
  let firstParameter = "This is first parameter";
  let secondParameter = "This is second Parameter";

  return {
    firstParameter: firstParameter,
    secondParameter: secondParameter,
  };
}

let myVariable = new myModule();

let myFirstVariable = myVariable.firstParameter;
let mySecondVariable = myVariable.secondParameter;

console.log(myFirstVariable);
console.log(mySecondVariable);
