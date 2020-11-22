import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-observale",
  templateUrl: "./observale.component.html",
  styleUrls: ["./observale.component.css"],
})
export class ObservaleComponent implements OnInit {
  time = new Observable<string>((observer: Observer<string>) => {
    setInterval(() => observer.next(new Date().toString()), 1000);
  });
  constructor() {}

  ngOnInit() {}
}
