import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PublicComponentsComponent } from './public-components.component';

describe('PublicComponentsComponent', () => {
  let component: PublicComponentsComponent;
  let fixture: ComponentFixture<PublicComponentsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PublicComponentsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PublicComponentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
