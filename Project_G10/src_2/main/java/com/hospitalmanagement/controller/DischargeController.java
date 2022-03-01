package com.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.model.Discharge;
import com.hospitalmanagement.service.DischargeServices;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class DischargeController {
@Autowired
DischargeServices dServices;
@GetMapping("/discharges")
public List<Discharge> getDischarges() {
	List<Discharge> dList = dServices.fetchDischarges();
return dList;

}
@DeleteMapping(value = "/patient/{P_ID}")
public ResponseEntity<Object> discharge(@PathVariable("P_ID") int P_ID) {

	dServices.dischargePatient(P_ID);
	return new ResponseEntity<>("Patient Discharged", HttpStatus.OK);
}
}