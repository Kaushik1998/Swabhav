import { Component, OnInit } from "@angular/core";

@Component({
  selector: "homepage",
  templateUrl: "./homepage.component.html",
  styleUrls: ["./homepage.component.css"],
})
export class HomepageComponent implements OnInit {
  title: string = "Kaushik Nippanikar";
  constructor() {}

  ngOnInit() {}
}
