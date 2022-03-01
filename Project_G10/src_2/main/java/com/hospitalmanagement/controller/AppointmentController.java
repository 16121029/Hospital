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
import com.hospitalmanagement.model.Appointment;
import com.hospitalmanagement.service.AppointmentService;






@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class AppointmentController {

	@Autowired
	AppointmentService aService;

//http://localhost:9002/api/v1/appointments
	@GetMapping("/appointments")
	public List<Appointment> getAppointments() {
		List<Appointment> aList = aService.fetchAppointments();

		return aList;

	}

	// http://localhost:9001/api/v1/appointment/1
	@GetMapping("/appointments/{AP_ID}")
	public ResponseEntity<Appointment> getAppointmentById(@PathVariable("AP_ID") int AP_ID)
			throws ResourceNotFoundException {
		Appointment a = aService.getAppointment(AP_ID);
		return ResponseEntity.ok().body(a);
	}

	// http://localhost:9001/api/v1/appointment
	@PostMapping("/appointments")
	public Appointment addAppointment(@RequestBody Appointment a) {

		Appointment appointment = aService.saveAppointment(a);

		// return new ResponseEntity<>("Employee added successsfully", HttpStatus.OK);
		return appointment;
	}

	@PutMapping("/appointment/{id}")
	public ResponseEntity<Appointment> updateAppointment(@PathVariable("AP_ID") int AP_Id,
			@RequestBody Appointment appointmentDetails) throws ResourceNotFoundException {
		Appointment app = aService.getAppointment(AP_Id);

		
		app.setAp_date(appointmentDetails.getAp_date());
		app.setAp_date(appointmentDetails.getAp_date());
		
		final Appointment updatedAppointment = aService.saveAppointment(app);
		return ResponseEntity.ok(updatedAppointment);
	}

//http://localhost:9001/api/v1/appointment/1
	@DeleteMapping(value = "/appointment/{AP_ID}")
	public ResponseEntity<Object> deleteAppointment(@PathVariable("AP_ID") int AP_ID) {

		aService.deleteAppointment(AP_ID);
		return new ResponseEntity<>("Appointment deleted successsfully", HttpStatus.OK);
	}
	
}