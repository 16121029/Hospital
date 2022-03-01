import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient, HttpClientModule}   from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DiseaseService {

  private baseUrl = 'http://localhost:8090/api/v1';

  constructor(private http: HttpClient) { }

  getDiseases(): Observable<any> {
    return this.http.get(`${this.baseUrl}`+'/getAllDiseases');
  }
    updateDisease(id: number, value: any): Observable<Object> {
      return this.http.put(`${this.baseUrl}/updateDisease/${id}`, value);
  }

  deleteDisease(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/deleteDisease/${id}`, { responseType: 'text' });
  }

  createDisease(disease: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`+'/saveDisease', disease);
  }
}
