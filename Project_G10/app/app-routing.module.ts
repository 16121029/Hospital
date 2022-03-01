import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ADiseaselistComponent } from './a-diseaselist/a-diseaselist.component';
import { AdminComponent } from './admin/admin.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { CreateDiseaseComponent } from './create-disease/create-disease.component';
import { CreateFeedbackComponent } from './create-feedback/create-feedback.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { DiseaseListComponent } from './disease-list/disease-list.component';
import { DoctorComponent } from './doctor/doctor.component';
import { FeedbackListComponent } from './feedback-list/feedback-list.component';
import { HomeComponent } from './home/home.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { PatientComponent } from './patient/patient.component';
import { PatientloginComponent } from './patientlogin/patientlogin.component';
import { PatientprofileComponent } from './patientprofile/patientprofile.component';
import { UpdateDiseaseComponent } from './update-disease/update-disease.component';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'patient', component: PatientComponent },
  { path: 'diseaselist', component: DiseaseListComponent },
  { path: 'a_diseaselist', component: ADiseaselistComponent },
  { path: 'add_disease', component: CreateDiseaseComponent },
  { path: 'updatedisease', component: UpdateDiseaseComponent },
  { path: 'logout', redirectTo: 'home', pathMatch:'prefix' },
  { path: 'feedbacks', component: CreateFeedbackComponent },
  { path: 'feedbacklist', component: FeedbackListComponent },
  { path: 'doctor', component: DoctorComponent },
  { path: 'add_patient', component: CreatePatientComponent },
  { path: 'patientlist', component: PatientListComponent },
  { path: 'adminlogin', component: AdminloginComponent },
  { path: 'patientlogin', component: PatientloginComponent },
  { path: 'patientprofile', component: PatientprofileComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
