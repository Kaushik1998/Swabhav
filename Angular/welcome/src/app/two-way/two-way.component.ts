import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'two-way',
  templateUrl: './two-way.component.html',
  styleUrls: ['./two-way.component.css'],
})
export class TwoWayComponent implements OnInit {
  firstName: string = 'Kaushik';
  lastName: string = 'Nippanikar';

  variable: string = 'null';
  constructor() {}

  ngOnInit(): void {}
}
