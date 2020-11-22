import { NgModel } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css'],
})
export class ParentComponent implements OnInit {
  message: string = '';
  username: any;
  inputBox: any;
  variable: any;
  onColor: string;
  offColor: string;

  inputEventFromChild(variable: string) {
    this.variable = variable;
  }
  constructor() {}

  ngOnInit(): void {}
}
