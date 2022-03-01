import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminloginService {

  private baseUrl = 'http://localhost:8090/api/v1';

  constructor(private http: HttpClient) { }

  validateUser(user: Object): Observable<Object> {
    //alert("in service"+user);
    return this.http.post(`${this.baseUrl}/loginUser`, user);
  }
 
  isUserLoggedIn() {
    let user = sessionStorage.getItem("username")
    if (user === null) return false
    return true
}
logout() {
  sessionStorage.removeItem("username");
  sessionStorage.setItem("login","failed");
  
}
getLoginStatus()
{
  const loginStatus=sessionStorage.getItem("login");
  return loginStatus;
}
}
