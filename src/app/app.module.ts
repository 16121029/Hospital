import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { PatientComponent } from './patient/patient.component';
import { CreateDiseaseComponent } from './create-disease/create-disease.component';
import { UpdateDiseaseComponent } from './update-disease/update-disease.component';
import { DiseaseDetailsComponent } from './disease-details/disease-details.component';
import { DiseaseListComponent } from './disease-list/disease-list.component';
import { HttpClientModule } from '@angular/common/http';
import { DiseaseService } from './disease.service';
import { DoctorComponent } from './doctor/doctor.component';
import { CreateFeedbackComponent } from './create-feedback/create-feedback.component';
import { FeedbackListComponent } from './feedback-list/feedback-list.component';
import { ADiseaselistComponent } from './a-diseaselist/a-diseaselist.component';
import { CreateAppointmentComponent } from './create-appointment/create-appointment.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { PatientloginComponent } from './patientlogin/patientlogin.component';
import { PatientprofileComponent } from './patientprofile/patientprofile.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AdminComponent,
    PatientComponent,
    CreateDiseaseComponent,
    UpdateDiseaseComponent,
    DiseaseDetailsComponent,
    DiseaseListComponent,
    DoctorComponent,
    CreateFeedbackComponent,
    FeedbackListComponent,
    ADiseaselistComponent,
    CreateAppointmentComponent,
    CreatePatientComponent,
    PatientListComponent,
    AdminloginComponent,
    PatientloginComponent,
    PatientprofileComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    CommonModule
  ],
  providers: [DiseaseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
