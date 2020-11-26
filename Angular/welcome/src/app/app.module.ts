import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HelloComponentComponent } from './hello-component/hello-component.component';
import { StudentComponent } from './student/student.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { TwoWayComponent } from './two-way/two-way.component';
import { SnakeComponent } from './snake/snake.component';
import { SnakeCasePipe } from './snake-case.pipe';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './parent/child/child.component';
import { StarComponent } from './parent/star/star.component';
import { NumberApiComponent } from './number-api/number-api.component';
import { HttpClient } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HelloComponentComponent,
    StudentComponent,
    TwoWayComponent,
    SnakeComponent,
    SnakeCasePipe,
    ParentComponent,
    ChildComponent,
    StarComponent,
    NumberApiComponent,
  ],
  imports: [BrowserModule, NgbModule, FormsModule, HttpClient],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
