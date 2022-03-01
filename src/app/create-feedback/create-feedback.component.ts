import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Feedback } from '../feedback';
import { FeedbackService } from '../feedback.service';

@Component({
  selector: 'app-create-feedback',
  templateUrl: './create-feedback.component.html',
  styleUrls: ['./create-feedback.component.css']
})
export class CreateFeedbackComponent implements OnInit {

  feedback: Feedback = new Feedback();
  submitted = false;

  constructor(private feedbackService: FeedbackService, private router: Router) { }

  ngOnInit() {
  }

  newFeedback(): void {
    this.submitted = false;
    this.feedback = new Feedback();
  }

  save() {
    this.feedbackService.createFeedback(this.feedback).subscribe(data => {
      console.log(data+" "+this.feedback)
     this.feedback = new Feedback();
      this.gotoList();
    },
   error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save(); 
    this.router.navigate(['/patient']);  
  }

  gotoList() {
    this.router.navigate(['/feedbacks']);
  }


}

