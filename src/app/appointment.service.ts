import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AppointmentService {

  private baseUrl = 'http://localhost:8090/api/v1';

  constructor(private http: HttpClient) { }

  getAppointments(): Observable<any> {
    return this.http.get(`${this.baseUrl}`+'/getAllAppointments');
  }
  getAppointment(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/getAppointment/${id}`);
  }

  createAppointment(patient: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`+'/saveAppointment', patient);
  }

  updateAppointment(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/updateAppointment/${id}`, value);
  }

  deleteAppointment(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/deleteAppointment/${id}`, { responseType: 'text' });
  }
}
