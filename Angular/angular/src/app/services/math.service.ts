import { LoggerService } from './logger.service';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class MathService {
  cubes(num: number): number {
    this.logger.log(num);
    return num ** 3;
  }
  constructor(private logger: LoggerService) {}
}
