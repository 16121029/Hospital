import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Disease } from '../disease';
import { DiseaseService } from '../disease.service';

@Component({
  selector: 'app-create-disease',
  templateUrl: './create-disease.component.html',
  styleUrls: ['./create-disease.component.css']
})
export class CreateDiseaseComponent implements OnInit {

  disease: Disease = new Disease();
  submitted = false;

  constructor(private diseaseService: DiseaseService, private router: Router) { }

  ngOnInit() {
  }

  newDisease(): void {
    this.submitted = false;
    this.disease = new Disease();
  }

  save() {
    this.diseaseService.createDisease(this.disease).subscribe(data => {
      console.log(data+" "+this.disease)
     this.disease = new Disease();
      this.gotoList();
    },
   error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save(); 
    this.router.navigate(['/admin']);  
  }

  gotoList() {
    this.router.navigate(['/diseaselist']);
  }


}
