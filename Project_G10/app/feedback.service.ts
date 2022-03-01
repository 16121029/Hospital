import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FeedbackService {
  private baseUrl = 'http://localhost:8090/api/v1';

  constructor(private http: HttpClient) { }

  getFeedback(): Observable<any> {
    return this.http.get(`${this.baseUrl}`+'/getAllFeedbacks');
  }
  

  createFeedback(feedback: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`+'/saveFeedback', feedback);
  }

  deleteFeedback(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/deleteFeedback/${id}`, { responseType: 'text' });
  }

}
