import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Feedback } from '../feedback';
import { FeedbackService } from '../feedback.service';

@Component({
  selector: 'app-feedback-list',
  templateUrl: './feedback-list.component.html',
  styleUrls: ['./feedback-list.component.css']
})

//component-->service-->http request

export class FeedbackListComponent implements OnInit {
  feedbacks: Observable<Feedback[]>=new Observable;

  constructor(private feedbackService: FeedbackService,private router: Router) {}
  
  ngOnInit(): void {
    this.getFeedbacks();
  }

  getFeedbacks()
  {
    this.feedbacks=this.feedbackService.getFeedback();
  }
  
  deleteFeedback(p_Id: number) {
    this.feedbackService.deleteFeedback(p_Id)
      .subscribe(
        data => {
          console.log(data);
          this.getFeedbacks();
        },
        error => console.log(error));
  }

}

