import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarteditComponent } from './cartedit.component';

describe('CarteditComponent', () => {
  let component: CarteditComponent;
  let fixture: ComponentFixture<CarteditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CarteditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CarteditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
