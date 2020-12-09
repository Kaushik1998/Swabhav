import { HttpClient } from "@angular/common/http";
import { Component, OnInit } from "@angular/core";
import { ActivatedRoute, ParamMap, Router } from "@angular/router";

@Component({
  selector: "app-public-components",
  templateUrl: "./public-components.component.html",
  styleUrls: ["./public-components.component.css"],
})
export class PublicComponentsComponent implements OnInit {
  file: string;
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private http: HttpClient
  ) {}

  ngOnInit() {
    // this.route.paramMap.subscribe((params: ParamMap) => {
    //   this.file = params.get("file");
    // });
  }
}
