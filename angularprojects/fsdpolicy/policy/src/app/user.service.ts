import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private usersUrl: string;
  

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/user/getuserslogin';
  }

  public login(user: User):Observable<Object> {
    
    return this.http.get(`${this.usersUrl}`);
  }


}
