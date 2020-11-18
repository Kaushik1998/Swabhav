import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'snakeCase',
})
export class SnakeCasePipe implements PipeTransform {
  transform(value: string): string {
    value = value.replace(/ /g, '_');
    return value.toLowerCase();
  }
}
