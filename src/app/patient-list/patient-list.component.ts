import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { PatientService } from '../patient.service';
import { Patient } from '../patient';
@Component({
  selector: 'app-patient-list',
  templateUrl: './patient-list.component.html',
  styleUrls: ['./patient-list.component.css']
})
export class PatientListComponent implements OnInit {
  patients: Observable<Patient[]>=new Observable;
  constructor(private patientService: PatientService,private router: Router) {}

  ngOnInit(): void {
    this.getPatients();
  }
  getPatients()
  {
    this.patients=this.patientService.getPatients();
  }
  
  deletePatient(p_id: number) {
    this.patientService.deletePatient(p_id)
      .subscribe(
        data => {
          console.log(data);
          this.getPatients();
        },
        error => console.log(error));
  }

  patientDetails(id: number){
    this.router.navigate(['details', id]);
  }
  updatePatient(id: number)
  {
    this.router.navigate(['update', id]);
  }
}
