import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
@Component({
  selector: 'app-create-patient',
  templateUrl: './create-patient.component.html',
  styleUrls: ['./create-patient.component.css']
})
export class CreatePatientComponent implements OnInit {
  patient: Patient = new Patient();
  submitted = false;
  constructor(private patientService: PatientService,private router: Router) {}

  ngOnInit() {
  }
  newPatient(): void {
    this.submitted = false;
    this.patient = new Patient();
  }

  save() {
    this.patientService.createPatient(this.patient).subscribe(data => {
      console.log(data+" "+this.patient)
     this.patient = new Patient();
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
    this.router.navigate(['/patient']);
  }


}


