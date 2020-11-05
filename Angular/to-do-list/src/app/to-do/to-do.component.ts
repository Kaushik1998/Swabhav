import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-to-do',
  templateUrl: './to-do.component.html',
  styleUrls: ['./to-do.component.css'],
})
export class ToDoComponent implements OnInit {
  name: string = 'Kaushik';
  surname: string = 'Nippanikar';
  phone: number = 999;
  constructor() {}

  ngOnInit(): void {}
}
