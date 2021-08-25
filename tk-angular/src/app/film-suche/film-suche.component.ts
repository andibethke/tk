import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-film-suche',
  templateUrl: './film-suche.component.html',
  styleUrls: ['./film-suche.component.css']
})
export class FilmSucheComponent implements OnInit {

  suche:string="";
  data:[]=[];
  constructor(private http:HttpClient) { }

  ngOnInit(): void {
  }

  onChange(){
    this.http.get<any>(`http://www.omdbapi.com/?apikey=477bca08&s=${this.suche}`)
      .subscribe(data=>{
        this.data=data.Search;
      })
  }

}
