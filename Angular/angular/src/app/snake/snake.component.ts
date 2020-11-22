import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'snake',
  templateUrl: './snake.component.html',
  styleUrls: ['./snake.component.css'],
})
export class SnakeComponent implements OnInit {
  variable: string = "kaushik";
  constructor() {}

  ngOnInit(): void {}
}
