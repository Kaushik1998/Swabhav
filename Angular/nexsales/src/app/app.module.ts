import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';

import { HelloComponentComponent } from './hello-component/hello-component.component';

@NgModule({
  declarations: [HelloComponentComponent],
  imports: [BrowserModule, AppRoutingModule],
  providers: [],
  bootstrap: [HelloComponentComponent],
})
export class AppModule {}
