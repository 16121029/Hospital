package com.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


//AdminController


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.model.Admin;
import com.hospitalmanagement.model.D_Signup;
import com.hospitalmanagement.model.P_Signup;
import com.hospitalmanagement.service.AdminService;
import com.hospitalmanagement.service.D_SignupService;
import com.hospitalmanagement.service.P_SignupService;



@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class AdminController {
	@Autowired
	AdminService adminService;
	
	
	@GetMapping("/admin")
	public ResponseEntity<Object> validateAdminLogin(@RequestBody Admin adminlogin) 		
	{
		Admin al = adminService.validateAdmin(adminlogin);
		if (al==null)
		
		return new ResponseEntity<>("Invalid credentials",HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(" Admin login Successfull ", HttpStatus.OK);
	}
	
	@Autowired
	D_SignupService d_signupservice;
	
	//http://localhost:8080/api/v2/doctors
		@GetMapping("/doctors")
	public List<D_Signup>getdoctors(){
		List<D_Signup> dList = d_signupservice.fetchdoctor();
		return dList;
	}
	
	// http://localhost:8080/api/v2/doctor
			@PostMapping("/doctor")
		public D_Signup addDoctor(@RequestBody D_Signup d) {

			D_Signup doctor = d_signupservice.savedoctor(d);

			// return new ResponseEntity<>("Employee added successsfully", HttpStatus.OK);
			return doctor;
		}
			
			
			@Autowired
			P_SignupService pService;

		//http://localhost:8080/api/v1/patients
			@GetMapping("/patients")
			public List<P_Signup> getPatients() {
				List<P_Signup> pList = pService.fetchPatients();

				return pList;

			}
			
			
			// http://localhost:8080/api/v1/patient
			@PostMapping("/patient")
			public P_Signup addPatient(@RequestBody P_Signup p) {

				P_Signup patient = pService.savePatient(p);

				// return new ResponseEntity<>("Employee added successsfully", HttpStatus.OK);
				return patient;
			}
}