const prompt = require("prompt-sync")();
const Game = require("./number-game");
const MAX_ATTEMPTS = 4;
let gameRetry = null;
do {
  let attempts = MAX_ATTEMPTS;
  let g = new Game();
  gameStart: while (attempts > 0) {
    let choice = prompt("Enter number [1-10] : " + g.NUMBER + "  ");
    let response = g.guessNumber(choice);
    switch (response) {
      case "NUMBER_FOUND":
        console.log("Number correct");
        break gameStart;
      case "NUMBER_HIGH":
        console.log("Number is High");
        attempts--;
        console.log("Attempts remaining : " + attempts);
        break;
      case "NUMBER_LOW":
        console.log("Number is Low");
        attempts--;
        console.log("Attempts remaining : " + attempts);
        break;
      default:
        console.log("Wrong choice");
        break;
    }
  }
  gameRetry = prompt("Do you want to retry [Y/N] ");
} while (gameRetry.toLowerCase() == "y");
