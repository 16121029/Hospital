import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ADiseaselistComponent } from './a-diseaselist.component';

describe('ADiseaselistComponent', () => {
  let component: ADiseaselistComponent;
  let fixture: ComponentFixture<ADiseaselistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ADiseaselistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ADiseaselistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
