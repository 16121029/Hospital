package com.hospitalmanagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.dao.P_SignupRepository;
import com.hospitalmanagement.model.P_Signup;


@Service
public class P_SignupService {

	@Autowired
	P_SignupRepository p_signupRepository;
	
	@Transactional
	public List<P_Signup> fetchPatients() {
		List<P_Signup> patientList=p_signupRepository.findAll();
		return patientList;
		
	}
	@Transactional
	public P_Signup savePatient(P_Signup p_signup) {
		
		return p_signupRepository.save(p_signup);
		
	}
	@Transactional
	public void update(P_Signup p) {
		p_signupRepository.save(p);	
	
	}
	
	@Transactional
	public void deletePatient(int p_id) {
		//empRepository.delete(emp);	
		System.out.println("service method called");
		p_signupRepository.deleteById(p_id);
	
	}
	@Transactional 
	  public P_Signup getPatient(int p_id) { 
	  Optional<P_Signup> optional= p_signupRepository.findById(p_id);
	  P_Signup p=optional.get();
	  return p;
	  }
	
	public P_Signup validateUser(P_Signup user) {
		P_Signup u=p_signupRepository.validateUser(user.getP_username(),user.getP_password());
		
		return u;
	}
}
