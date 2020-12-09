module.exports = Account;

function Account() {
  this.DEFAULT_BALANCE = 500;
  this.balance = this.DEFAULT_BALANCE;
}

Account.prototype.deposite = function deposite(money) {
  this.balance += parseInt(money);
  return this.balance;
};

Account.prototype.withdraw = function withdraw(money) {
  return this.balance > money
    ? (this.balance = this.balance - parseInt(money))
    : "Low Balance";
};

Account.prototype.getBalance = function () {
  return this.balance;
};
