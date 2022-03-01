package com.hospitalmanagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.model.Discharge;
import com.hospitalmanagement.dao.DischargeRepository;
@Service

public class DischargeServices {

	@Autowired
	DischargeRepository DischargeRepository;
	
	@Transactional
	//to view the discharge list
	public List<Discharge> fetchDischarges() {
		List<Discharge>dischargeList=DischargeRepository.findAll();
		return dischargeList;
}
	@Transactional
	
	//to discharge patient
	public void dischargePatient(int P_ID) {
		System.out.println("dicharged the patient");
          DischargeRepository.deleteById(P_ID);
	
	}
	@Transactional 
	
	  public Discharge getDischarge(int P_ID) { 
	  Optional<Discharge> optional= DischargeRepository.findById(P_ID);
	  Discharge d=optional.get();
	  return d;
	  }
}

