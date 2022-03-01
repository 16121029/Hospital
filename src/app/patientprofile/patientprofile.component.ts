import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-patientprofile',
  templateUrl: './patientprofile.component.html',
  styleUrls: ['./patientprofile.component.css']
})
export class PatientprofileComponent implements OnInit {
  username!: string | null;
  name!: string | null;
  constructor() { }

  ngOnInit() {
    this.username=sessionStorage.getItem("username");
    this.name=sessionStorage.getItem("name");
  }


}
