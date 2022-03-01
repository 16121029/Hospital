import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Disease } from '../disease';
import { DiseaseService } from '../disease.service';

@Component({
  selector: 'app-a-diseaselist',
  templateUrl: './a-diseaselist.component.html',
  styleUrls: ['./a-diseaselist.component.css']
})
export class ADiseaselistComponent implements OnInit {

  diseaselist: Observable<Disease[]>=new Observable;

  constructor(private diseaseService: DiseaseService,private router: Router) {}

  ngOnInit(): void {
    this.getDiseases();
  }

  getDiseases()
  {
    this.diseaselist=this.diseaseService.getDiseases();
  }

  deleteDisease(id: number) {
    this.diseaseService.deleteDisease(id)
      .subscribe(
        data => {
          console.log(data);
          this.getDiseases();
        },
        error => console.log(error));
  }

}
