package com.hospitalmanagement.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hospitalmanagement.exception.ResourceNotFoundException;
import com.hospitalmanagement.model.P_Signup;
//import com.hospitalmanagement.model.Admin;
import com.hospitalmanagement.service.P_SignupService;



@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v4")
@RestController
public class P_SignupController {

	@Autowired
	P_SignupService pService;

//http://localhost:8080/api/v1/patients
	@GetMapping("/patients")
	public List<P_Signup> getPatients() {
		List<P_Signup> pList = pService.fetchPatients();

		return pList;

	}

	// http://localhost:8080/api/v1/patient/1
	@GetMapping("/patient/{p_id}")
	public ResponseEntity<P_Signup> getPatientById(@PathVariable("p_id") int p_id)
			throws ResourceNotFoundException {
		P_Signup p = pService.getPatient(p_id);
		return ResponseEntity.ok().body(p);
	}

	// http://localhost:8080/api/v1/patient
	@PostMapping("/patients")
	public P_Signup addPatient(@RequestBody P_Signup p) {

		P_Signup patient = pService.savePatient(p);

		// return new ResponseEntity<>("Employee added successsfully", HttpStatus.OK);
		return patient;
	}

	// http://localhost:8080/api/v1/patient/2
	@PutMapping("/patient/{p_id}")
	public ResponseEntity<P_Signup> updatePatient(@PathVariable("p_id") int p_id,
			@RequestBody P_Signup PatientDetails) throws ResourceNotFoundException {
		P_Signup p = pService.getPatient(p_id);

		
		p.setP_id(PatientDetails.getP_id());
		p.setP_contact_no(PatientDetails.getP_contact_no());
		p.setP_password(PatientDetails.getP_password());
		final P_Signup updatedPatient = pService.savePatient(p);
		return ResponseEntity.ok(updatedPatient);
	}

//http://localhost:8080/api/v1/patient/1
	@DeleteMapping(value = "/patient/{p_id}")
	public ResponseEntity<Object> deletePatient(@PathVariable("p_id") int p_id) {

		pService.deletePatient(p_id);
		return new ResponseEntity<>("Patient deleted successsfully", HttpStatus.OK);
	}
	
	@PostMapping("/Patient")
	public P_Signup validateUser(@RequestBody P_Signup user) 		
	{
		System.out.println("in controller="+user.getP_username());
		P_Signup u = pService.validateUser(user);
		return u;
	}
	
}