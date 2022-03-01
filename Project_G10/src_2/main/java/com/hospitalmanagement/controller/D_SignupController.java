package com.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.exception.ResourceNotFoundException;
import com.hospitalmanagement.model.D_Signup;
import com.hospitalmanagement.service.D_SignupService;



@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v3")
@RestController
public class D_SignupController {
	
	@Autowired
	D_SignupService d_signupservice;
	
	//http://localhost:9001/api/v2/doctors
		@GetMapping("/doctors")
	public List<D_Signup>getdoctors(){
		List<D_Signup> dList = d_signupservice.fetchdoctor();
		return dList;
	}
	
	// http://localhost:8080/api/v2/doctor/1
		@GetMapping("/doctor/{d_id}")
	public ResponseEntity<D_Signup> getdoctorById(@PathVariable("d_id") int d_id)
			throws ResourceNotFoundException {
		D_Signup d = d_signupservice.getdoctor(d_id);
		return ResponseEntity.ok().body(d);
	}
	
	// http://localhost:8080/api/v2/doctor
		@PostMapping("/doctors")
	public D_Signup addDoctor(@RequestBody D_Signup d) {

		D_Signup doctor = d_signupservice.savedoctor(d);

		// return new ResponseEntity<>("Employee added successsfully", HttpStatus.OK);
		return doctor;
	}
		
		// http://localhost:8080/api/v2/doctor/2
		@PutMapping("/doctor/{d_id}")
	public ResponseEntity<D_Signup> updateDoctor(@PathVariable("d_id") int d_id,
			@RequestBody D_Signup DoctorDetails) throws ResourceNotFoundException {
		D_Signup p = d_signupservice.getdoctor(d_id);

		
		p.setD_id(DoctorDetails.getD_id());
		p.setD_contact_no(DoctorDetails.getD_contact_no());
		p.setD_password(DoctorDetails.getD_password());
		final D_Signup updateddoctor = d_signupservice.savedoctor(p);
		return ResponseEntity.ok(updateddoctor);
	}
	
	//http://localhost:8080/api/v2/doctor/1
		@DeleteMapping(value = "/doctor/{d_id}")
	public ResponseEntity<Object> deletedoctor(@PathVariable("d_id") int d_id) {

		d_signupservice.deletedoctor(d_id);
		return new ResponseEntity<>("doctor deleted successsfully", HttpStatus.OK);
	}
		
		@PostMapping("/Patient")
	public D_Signup validateUser(@RequestBody D_Signup user) 		
	{
		System.out.println("in controller="+user.getD_username());
		D_Signup u = d_signupservice.validateUser(user);
		return u;
	}

}