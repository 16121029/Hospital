package com.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.model.DoctorLogin;
import com.hospitalmanagement.model.authentication;
import com.hospitalmanagement.service.DoctorLoginService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class DoctorLoginController {
	
	@Autowired
	DoctorLoginService doctorLoginService;
	
	@PostMapping("/doctor1")
	public ResponseEntity<authentication> validateDoctorLogin(@RequestBody authentication au){
		
		authentication authentication= doctorLoginService.validateDoctorLogin(au.getUsername(),au.getPassword());
		return new ResponseEntity<authentication>(authentication,HttpStatus.OK);
		
	}

}