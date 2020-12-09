let Events = require("events");

const DEFAULT_BALANCE = 500;
const balanceChange = "balanceChange";
let balance = DEFAULT_BALANCE;


exports.deposite = function (money) {
  balance += parseInt(money);
  
  return balance;
};

exports.withdraw = function (money) {
  return balance > money
    ? (balance = balance - parseInt(money))
    : "Low Balance";
};

exports.getBalance = function () {
  return balance;
};
