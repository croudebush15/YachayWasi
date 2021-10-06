import { Component, OnInit } from '@angular/core';
import { Teacher } from '../common/model/Teacher';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  teacher: Teacher = new Teacher;

  constructor() { }

  ngOnInit(): void {
    window.scroll(0,0);
      
    this.teacher = JSON.parse(sessionStorage.getItem("user") || '{}') as Teacher;
  }

}
