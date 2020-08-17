let arrayOfFunction = [                 // Array Of Function
  () => {
    return `This is the first function`; // Arrow Function
  },
  obj => {
    return `This is the second function. This is your first name : ${obj.firstName}. This is your last name : ${obj.lastName}`; // Arrow Function
  },
];

var person = {firstName:"Kaushik", lastName:"Nippanikar", age:50, eyeColor:"blue"}; // Object literal

console.log(arrayOfFunction[0]());
console.log(arrayOfFunction[1](person));
console.log()
