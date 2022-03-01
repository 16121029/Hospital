import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Disease } from '../disease';
import { DiseaseService } from '../disease.service';

@Component({
  selector: 'app-disease-list',
  templateUrl: './disease-list.component.html',
  styleUrls: ['./disease-list.component.css']
})
export class DiseaseListComponent implements OnInit {
  diseases: Observable<Disease[]>=new Observable;

  constructor(private diseaseService: DiseaseService,private router: Router) {}

  ngOnInit(): void {
    this.getDiseases();
  }

  getDiseases()
  {
    this.diseases=this.diseaseService.getDiseases();
  }

}
