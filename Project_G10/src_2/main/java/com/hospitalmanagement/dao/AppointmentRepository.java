package com.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.model.Appointment;



@Repository
public interface AppointmentRepository extends JpaRepository<Appointment ,Integer>{
	
}
