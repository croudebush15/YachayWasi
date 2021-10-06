import { Component, OnInit } from '@angular/core';
import { Teacher } from '../model/Teacher';

@Component({
  selector: 'app-main-nav',
  templateUrl: './main-nav.component.html',
  styleUrls: ['./main-nav.component.css']
})
export class MainNavComponent implements OnInit {

  teacher: Teacher = new Teacher;

  constructor() { }

  ngOnInit(): void {
    this.teacher = JSON.parse(sessionStorage.getItem("user") || '{}') as Teacher;
  }

}
