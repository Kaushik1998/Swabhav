import { IProduct } from "./../product-list/IProduct";
import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable({
  providedIn: "root",
})
export class ProductFetchService {
  getProducts() {
    return this.http.get("../../../assets/products.json");
  }

  getProductWithID(id: number) {
    let product: IProduct;

    this.getProducts().subscribe((success: IProduct[]) => {
      product = success.find((product) => {
        return product.productId == id;
      });
    });

    return product;
  }

  constructor(private http: HttpClient) {}
}
