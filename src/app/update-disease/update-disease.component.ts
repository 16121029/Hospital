import { Component, OnInit } from '@angular/core';
import { Disease } from '../disease';
import { ActivatedRoute, Router } from '@angular/router';
import { DiseaseService } from '../disease.service';

@Component({
  selector: 'app-update-disease',
  templateUrl: './update-disease.component.html',
  styleUrls: ['./update-disease.component.css']
})



export class UpdateDiseaseComponent implements OnInit {

  id: number=0;
  disease: Disease=new Disease();
  
  constructor(private route: ActivatedRoute,private router: Router,
    private diseaseService: DiseaseService) { }

  ngOnInit() {
    this.disease = new Disease();

    this.id = this.route.snapshot.params['id'];
    
    this.diseaseService.getDiseases()
      .subscribe(data => {
        console.log(data)
        this.disease = data;
      }, error => console.log(error));
  }

  updateDisease() {
    this.diseaseService.updateDisease(this.id, this.disease)
      .subscribe(data => {
        console.log(data);
        this.disease = new Disease();
        this.gotoList();
      }, error => console.log(error));
  }

  onSubmit() {
    this.updateDisease();    
  }

  gotoList() {
    this.router.navigate(['/diseases']);
  }

}
