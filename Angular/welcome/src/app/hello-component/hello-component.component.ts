import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'hello',
  templateUrl: './hello-component.component.html',
  styleUrls: ['./hello-component.component.css'],
})
export class HelloComponentComponent implements OnInit {
  pi: number;
  name: string;
  constructor() {
    this.pi = Math.PI;
    this.name = 'Kaushik';
  }

  ngOnInit(): void {}
}
