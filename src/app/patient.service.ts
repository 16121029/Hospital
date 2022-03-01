import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PatientService {
  private baseUrl = 'http://localhost:8090/api/v1';

  constructor(private http: HttpClient) { }

  getPatients(): Observable<any> {
    return this.http.get(`${this.baseUrl}`+'/getAllPatients');
  }
  getPatient(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/getPatient/${id}`);
  }

  createPatient(patient: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`+'/savePatient', patient);
  }

  updatePatient(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/updatePatient/${id}`, value);
  }

  deletePatient(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/deletePatient/${id}`, { responseType: 'text' });
  }

  validatePatient(user: Object): Observable<Object> {
    //alert("in service"+user);
    return this.http.post(`${this.baseUrl}/loginPatient`, user);
  }
 
  isUserLoggedIn() {
    let user = sessionStorage.getItem("p_username")
    if (user === null) return false
    return true
}
logout() {
  sessionStorage.removeItem("p_username");
  sessionStorage.setItem("patientlogin","failed");
  
}
getLoginStatus()
{
  const loginStatus=sessionStorage.getItem("patientlogin");
  return loginStatus;
}

}
