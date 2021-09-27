import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class InicioService {

  constructor(private http: HttpClient) { }

  login(username: string, password: string): Observable<boolean>{
    let url = 'http://localhost:8082/login';
    return this.http.post<boolean>(url, {
        username: username,
        password: password
    })
  }

  getToken(){  
    return !!sessionStorage.getItem("token");  
    }  
}
