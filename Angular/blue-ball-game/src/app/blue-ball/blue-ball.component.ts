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

  balls: IBall[] = [];
  maxBalls: number = this.DEFAULT_BALLS;
  attempts: number = this.DEFAULT_ATTEMPTS;
  randomNumber: number = this.DEFAULT_RANDOM_NUMBER;
  gameRunning: boolean = false;
  ballsClicked: number = 0;

  startGame() {
    this.gameRunning = true;
    this.ballsClicked = 0;
    this.generateRandomNumber();
    this.generateBalls();
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

  clickBall(ball: IBall) {
    ball.currentColor = ball.bgColor;
    this.ballsClicked++;
  }
  checkGame(ball: IBall) {
    this.clickBall(ball);
    if (ball.bgColor == 'blue') {
      alert('You have won');
      this.endGame();
    }
    if (this.ballsClicked > this.attempts) {
      alert('Game is over\nYou Lost');
      this.endGame();
    }
  }
  endGame() {
    this.gameRunning = false;
  }
  constructor() {}

  ngOnInit(): void {}
}
