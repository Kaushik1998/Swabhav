const Event = require("events");

module.exports = class Account extends (
  Event
) {
  DEFAULT_BALANCE = 500;
  balanceChange = "balanceChange";

  constructor() {
    super();
    this.balance = this.DEFAULT_BALANCE;
    this.on("balanceChange", (money, balance) => {
      console.log("-------------------------------------------");
      this.sendSms(balance);
      this.sendEmail(balance);
      console.log(`Money :${money}. Balance : ${balance}`);
      console.log("-------------------------------------------");
    });
  }

  deposite = function (money) {
    this.balance += parseInt(money);
    this.emit("balanceChange", money, this.balance);
  };

  withdraw = function (money) {
    this.balance -= parseInt(money);
    this.emit("balanceChange", money, this.balance);
  };

  getBalance = function () {
    return this.balance;
  };

  sendSms(balance) {
    console.log("Sending sms, updated balance: " + balance);
  }
  sendEmail(balance) {
    console.log("Sending email, updated balance: " + balance);
  }
};
