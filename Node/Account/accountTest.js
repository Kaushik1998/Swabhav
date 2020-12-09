const modular = require("./account1");
const Constructor = require("./account2");
const Classs = require("./account3");
const prompt = require("prompt-sync")();
let classs = new Classs();
let constructor = new Constructor();

console.log("1.Modular Approach");
console.log("2.Constructor Approach");
console.log("3.Class Approach");
console.log("4.Exit");
loop: while (true) {
  let choice = prompt("Enter your choice : ");
  switch (choice) {
    case "1":
      transaction(modular);
      break;

    case "2":
      transaction(constructor);
      break;

    case "3":
      transaction(classs);
      break;
    case "4":
      console.log("Closing App");
      break loop;
    default:
      console.log("Wrong choice");
      break;
  }
}
function transaction(approach_object) {
  // approach_object.on("balanceChange", (money, balance) => {
  //   console.log("-------------------------------------------");
  //   approach_object.sendSms(balance);
  //   approach_object.sendEmail(balance);
  //   console.log(`Money :${money}. Balance : ${balance}`);
  //   console.log("-------------------------------------------");
  // });

  console.log("Balance : " + approach_object.getBalance());
  let deposite = prompt("Enter Amount to deposit : ");
  approach_object.deposite(deposite);
  console.log("Balance : " + approach_object.getBalance());
  let withdraw = prompt("Enter Amount to withdraw : ");
  approach_object.withdraw(withdraw);
  console.log("Balance : " + approach_object.getBalance());
}
