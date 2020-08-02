//This is Constructor Pattern

function myFunction(first, second, third) {
  this.first = first;
  this.second = second;
  this.third = third;
}

myFunction.prototype.display = function () {
  return (
    " First Parameter is : " +
    this.first +
    " Second Parameter is : " +
    this.second +
    " Third Parameter is : " +
    this.third
  );
};

let obj1 = new myFunction(1,2,3);
let obj2 = new myFunction('1st','2nd','3rd');
console.log(obj1.display());
console.log(obj2.display());
