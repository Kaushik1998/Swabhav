import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
})
export class ChildComponent implements OnInit {
  message: string;
  @Input('input') variable: any = null;
  @Input('onColor') onColor: string = '';
  @Input('offColor') offColor: string = '';
  @Output()
  outputEvent = new EventEmitter();
  buttonStatus: boolean = true;
  color: string = 'blue';

  callParent() {
    this.outputEvent.emit(this.message);
  }

  toggleButton() {
    this.buttonStatus = !this.buttonStatus;
    if (this.buttonStatus) {
      this.color = this.onColor;
    } else {
      this.color = this.offColor;
    }
  }
  constructor() {}

  ngOnInit(): void {}
}
