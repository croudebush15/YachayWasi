import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { InicioService } from '../service/inicio-service.service';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  model: any = {};
  loginError: boolean = false;

    constructor(
        private route: ActivatedRoute,
        private router: Router,
        private service: InicioService
    ) { }

    ngOnInit() {
        sessionStorage.clear();
        this.loginError = false;
    }

    login() {
        this.service.login(this.model.username, this.model.password).subscribe(user => {
            if (user) {
                sessionStorage.setItem('token', btoa(this.model.username + ':' + this.model.password));
                sessionStorage.setItem('user', JSON.stringify(user))
                //console.log(sessionStorage.getItem("user"));
                this.router.navigate(['']);                
            } else {
                this.loginError = true;
            }
        });
    }

}
