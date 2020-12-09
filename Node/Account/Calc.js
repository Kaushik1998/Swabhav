const Events = require("events");

module.exports = class Calc extends (
  Events
) {
  add(a, b) {
    let result = a + b;
    this.emit("Add", `Result is ${result}`);
    return result;
  }
};
