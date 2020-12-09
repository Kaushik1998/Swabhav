module.exports = class MathGame {
  NUMBER_FOUND = "NUMBER_FOUND";
  NUMBER_LOW = "NUMBER_LOW";
  NUMBER_HIGH = "NUMBER_HIGH";
  constructor() {
    this.NUMBER = Math.floor(Math.random() * 10) + 1;
  }

  guessNumber(number) {
    if (number == this.NUMBER) {
      return this.NUMBER_FOUND;
    } else if (number > this.NUMBER) {
      return this.NUMBER_HIGH;
    } else if (number < this.NUMBER) {
      return this.NUMBER_LOW;
    }
  }
};
