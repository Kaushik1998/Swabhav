import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
  name: "filter",
})
export class FilterPipe implements PipeTransform {
  transform(value: any, args?: any): any {
    for (let p in value) {
      let property = p.toString();
      if (property.includes(args)) {
        return value;
      }
    }
  }
}
