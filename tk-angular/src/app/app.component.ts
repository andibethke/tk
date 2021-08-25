import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  zeit = '';

  /**
   *
   */
  constructor() {
    setInterval(()=>this.zeit=new Date().toLocaleTimeString(),1000) ;   
  }

}
