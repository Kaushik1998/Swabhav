import { Star } from "./star.enum";
import { IStar } from "./IStar";
import { Component, Input, OnInit, Output, EventEmitter } from "@angular/core";

@Component({
  selector: "star",
  templateUrl: "./star.component.html",
  styleUrls: ["./star.component.css"],
})
export class StarComponent implements OnInit {
  @Input("stars") starCount: number = 5;
  @Output()
  getRating = new EventEmitter();
  starRating: number;
  starArray: IStar[] = [];

  starClicked(index: number) {
    for (let i = 0; i <= index; i++) {
      this.starArray[i].class = Star.FULL;
    }

    for (let i = index + 1; i < this.starArray.length; i++) {
      this.starArray[i].class = Star.EMPTY;
    }

    this.starRating = index + 1;
  }

  starDoubleClicked(index: number) {
    for (let i = 0; i < index; i++) {
      this.starArray[i].class = Star.FULL;
    }

    this.starArray[index].class = Star.HALF;

    for (let i = index + 1; i < this.starArray.length; i++) {
      this.starArray[i].class = Star.EMPTY;
    }

    this.starRating = index + 0.5;
  }

  currentRate = 8;

  constructor() {}

  ngOnInit(): void {
    for (let index = 0; index < this.starCount; index++) {
      this.starArray.push({ class: Star.EMPTY, halfStar: false });
    }
  }
}
