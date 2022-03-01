package com.hospitalmanagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.dao.D_SignupRepository;
import com.hospitalmanagement.exception.ResourceNotFoundException;
import com.hospitalmanagement.model.D_Signup;



@Service
public class D_SignupService {
	
	@Autowired
	D_SignupRepository d_signuprepository;
	
	@Transactional
	public List<D_Signup> fetchdoctor() {
		List<D_Signup> doctorList=d_signuprepository.findAll();
		return doctorList;
	}
	
	@Transactional	
public D_Signup savedoctor(D_Signup d_signup) {
		
		return d_signuprepository.save(d_signup);
		}
	
	@Transactional
public void update(D_Signup d) {
	d_signuprepository.save(d);	

}
	
	@Transactional	
public void deletedoctor(int d_id) {
	//empRepository.delete(emp);	
	System.out.println("service method called");
	d_signuprepository.deleteById(d_id);

}
	
	@Transactional	
public D_Signup getdoctor(int d_id) { 
		
	  D_Signup doctor= d_signuprepository.validateDoctor(d_id);
	  //D_Signup d=optional.get();
	  return doctor;
	  }
public D_Signup validateUser(D_Signup user) {
	D_Signup u=d_signuprepository.validateUser(user.getD_username(),user.getD_password());
	
	return u;
}

}
