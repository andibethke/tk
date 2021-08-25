import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FilmSucheComponent } from './film-suche.component';

describe('FilmSucheComponent', () => {
  let component: FilmSucheComponent;
  let fixture: ComponentFixture<FilmSucheComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FilmSucheComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FilmSucheComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
