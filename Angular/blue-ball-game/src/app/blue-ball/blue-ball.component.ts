import { Component, OnInit } from '@angular/core';

import { IBall } from './IBall';

@Component({
  selector: 'blue-ball',
  templateUrl: './blue-ball.component.html',
  styleUrls: ['./blue-ball.component.css'],
})
export class BlueBallComponent implements OnInit {
  readonly DEFAULT_BALLS: number = 20;
  readonly DEFAULT_ATTEMPTS: number = 4;
  readonly DEFAULT_RANDOM_NUMBER = 0;
  readonly WELCOME_MESSAGE = 'Welcome to the Game..!!';

  balls: IBall[] = [];
  maxBalls: number = this.DEFAULT_BALLS;
  attempts: number = this.DEFAULT_ATTEMPTS;
  randomNumber: number = this.DEFAULT_RANDOM_NUMBER;
  showRules: boolean = true;
  showRestartButton: boolean = false;
  showBalls: boolean = false;
  message: string = this.WELCOME_MESSAGE;

  startGame() {
    this.showRules = false;
    this.showBalls = true;
    this.generateRandomNumber();
    this.generateBalls();
    this.attempts = this.DEFAULT_ATTEMPTS;
    this.message = this.WELCOME_MESSAGE;

    console.log('Winning Ball : ' + this.randomNumber);
  }
  generateRandomNumber() {
    this.randomNumber = Math.floor(Math.random() * this.maxBalls);
  }

  generateBalls() {
    this.balls = [];
    for (let i = 0; i < this.maxBalls; i++) {
      switch (i) {
        case this.randomNumber:
          this.balls.push({
            id: i,
            bgColor: 'blue',
            currentColor: 'grey',
            disabled: false,
          });
          break;

        case this.randomNumber + 1:
          this.balls.push({
            id: i,
            bgColor: 'yellow',
            currentColor: 'grey',
            disabled: false,
          });
          break;

        case this.randomNumber - 1:
          this.balls.push({
            id: i,
            bgColor: 'red',
            currentColor: 'grey',
            disabled: false,
          });
          break;

        default:
          this.balls.push({
            id: i,
            bgColor: 'burlywood',
            currentColor: 'grey',
            disabled: false,
          });
          break;
      }
    }
  }

  clickBall(ball: IBall) {}
  checkGame(ball: IBall) {
    if (this.attempts > 0) {
      ball.currentColor = ball.bgColor;
      this.attempts--;

      if (ball.bgColor == 'yellow' || ball.bgColor == 'red') {
        this.message = 'You are very close';
      } else {
        this.message = 'Keep going';
      }
      if (ball.bgColor == 'blue') {
        this.message = 'Congrats you found Blue Ball....!';
        this.endGame();
      }
    } else if (this.attempts == 0) {
      this.message = 'Max attempts exceeded';
      this.endGame();
    }
  }
  endGame() {
    let winnerBall: IBall = this.balls[this.randomNumber];
    winnerBall.currentColor = winnerBall.bgColor;
    this.showRestartButton = true;
  }

  restartGame() {
    location.reload();
  }
  constructor() {}

  ngOnInit(): void {}
}
