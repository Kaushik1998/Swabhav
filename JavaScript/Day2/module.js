class myModule() {
  let firstParameter = "This is first parameter";
  let secondParameter = "This is second Parameter";

  setFirst(name){
    this.firstParameter=name;
  }

  getFirst(){
    return `First Para is ${firstParameter}`;
  }

}

let myVariable = new myModule();

let myFirstVariable = myVariable.firstParameter;
let mySecondVariable = myVariable.secondParameter;

console.log(myFirstVariable);
console.log(mySecondVariable);
