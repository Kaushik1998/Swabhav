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
myFunction.prototype.newFunction = function () {
  return "this is new function";
};
let obj1 = new myFunction(1, 2, 3);
console.log(new Object());
