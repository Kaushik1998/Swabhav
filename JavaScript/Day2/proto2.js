function Employee(id, name) {
  this.id = id;
  this.name = name;
}

Employee.prototype.getDetails = function () {
  return "Id: " + this.id + " Name: " + this.name;
};
var e1 = new Employee(1, "Abc");
console.log(e1);
console.log(e1.getDetails());
console.log("lol",Employee.prototype === e1.__proto__); //true

var e2 = new Employee(2, "Def");
console.log(Employee.prototype)
console.log(e1.__proto__);
console.log("Employee Proto",Employee.prototype.__proto__)
console.log("Obj proto",Object.prototype.__proto__)