import { MathService } from './../services/math.service';
import { LoggerService } from './../services/logger.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'two-way',
  templateUrl: './two-way.component.html',
  styleUrls: ['./two-way.component.css'],
  providers: [LoggerService, MathService],
})
export class TwoWayComponent implements OnInit {
  firstName: string = 'Kaushik';
  lastName: string = 'Nippanikar';

  variable: string = 'null';
  constructor(private math: MathService) {}

  ngOnInit(): void {
    let result = this.math.cubes(4);
    console.log(result);
  }
}
