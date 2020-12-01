import { FilterPipe } from "./../filter.pipe";
import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";

import { SharedModule } from "./../shared/shared.module";
import { AcmeRootComponent } from "./acme-root/acme-root.component";
import {
  acmeRoutingComponents,
  AcmeRoutingModule,
} from "./acme-routing.module";

import { StarComponent } from "./star/star.component";
import { ProductFilterPipe } from "./product-filter.pipe";

@NgModule({
  declarations: [
    AcmeRootComponent,
    acmeRoutingComponents,
    StarComponent,
    FilterPipe,
    ProductFilterPipe,
  ],
  imports: [CommonModule, SharedModule, AcmeRoutingModule],
  exports: [AcmeRootComponent],
})
export class AcmeModule {}
export const acmeRoot = [AcmeRootComponent];
