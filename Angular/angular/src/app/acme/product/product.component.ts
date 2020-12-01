import { Location } from "@angular/common";
import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { IProduct } from "./../product-list/IProduct";

@Component({
  selector: "app-product",
  templateUrl: "./product.component.html",
  styleUrls: ["./product.component.css"],
})
export class ProductComponent implements OnInit {
  newProduct: IProduct;

  products;
  product: IProduct;
  productId: number;
  constructor(private router: Router, private location: Location) {
    this.product = this.router.getCurrentNavigation().extras.state;
    location.subscribe(
      (success) => {
        console.log("Hello");
        console.log(success);
      },
      (error) => {
        console.log(error);
      }
    );
  }

  ngOnInit() {
    // this.route.paramMap.subscribe((params: ParamMap) => {
    //   this.productId = parseInt(params.get("productId"));
    //   if (isNaN(this.productId)) {
    //     console.log("sending back");
    //     this.router.navigate(["/landing"]);
    //   }
    // });
    // this.service.getProducts().subscribe((jsonFile: IProduct) => {
    //   this.products = jsonFile;
    //   this.product = this.products.find((product) => {
    //     return product.productId === this.productId;
    //   });
    // });
  }
}
