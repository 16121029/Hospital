import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminLogin } from '../adminlogin';
import { AdminloginService } from '../adminlogin.service';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  user: AdminLogin = new AdminLogin();
  submitted = false;
  message!: string;
  hasLoginFailed!: boolean;
 
  

  ngOnInit(): void {
  }

  newUser(): void {
    this.submitted = false;
    this.user = new AdminLogin();
  }
  constructor(private adminloginService: AdminloginService, private router: Router) { }

  onSubmit() {
    this.submitted = true;
    this.validate();    
  }

  validate() {
   // alert(this.user.username);
    this.adminloginService.validateUser(this.user).subscribe(data => {
   
     //console.log(data+" "+this.user)
    if(data!=null)
    {
    
    this.router.navigate(['/admin']);
    sessionStorage.setItem("username", this.user.username);
    sessionStorage.setItem("login","success");
    this.hasLoginFailed=false;
    }
    else
    {
    this.router.navigate(['/adminlogin']);
    this.message="Invalid Credentials....Try again!";
    this.hasLoginFailed=true;
    sessionStorage.setItem("login","failed");
    this.user = new AdminLogin();
    }
    },
   error => console.log(error)
   
   );
  }


}
