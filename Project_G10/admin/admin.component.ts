import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }
  onSubmit(form:NgForm){
    if(form.value.username==='admin'&& form.value.password ==='admin123'){
    alert('welcome admin');
    }
    else{
      alert('invalid credential');
    }
  }
  Signup(form:NgForm){
    this.router.navigateByUrl('AdminSignup');
  }
}
