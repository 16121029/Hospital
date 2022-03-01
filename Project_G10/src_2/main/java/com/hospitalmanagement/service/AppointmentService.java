package com.hospitalmanagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.dao.AppointmentRepository;
import com.hospitalmanagement.model.Appointment;




@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository AppointmentRepository;
	
	@Transactional
	public List<Appointment> fetchAppointments() {
		List<Appointment> appointmentList=AppointmentRepository.findAll();
		return appointmentList;
		
	}
	@Transactional
	public Appointment saveAppointment(Appointment appointment) {
		Appointment ap = new Appointment(appointment.getP_name(), appointment.getCity(), appointment.getGender(), appointment.getAp_date(), appointment.getAp_time(),"pending", appointment.getSymptoms());
		return AppointmentRepository.save(ap);
		
	}
	@Transactional
	public void updateAppointment(Appointment appo) {
		AppointmentRepository.save(appo);	
	
	}
	
	@Transactional
	public void deleteAppointment(int AP_ID) {
		//empRepository.delete(emp);	
		System.out.println("service method called");
           AppointmentRepository.deleteById(AP_ID);
	
	}
	@Transactional 
	  public Appointment getAppointment(int AP_ID) { 
	  Optional<Appointment> optional= AppointmentRepository.findById(AP_ID);
	  Appointment a=optional.get();
	  return a;
	  }
	

}



