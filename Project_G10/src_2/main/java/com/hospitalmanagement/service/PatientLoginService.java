package com.hospitalmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.dao.PatientLoginRepository;
import com.hospitalmanagement.model.P_Signup;
import com.hospitalmanagement.model.PatientLogin;
import com.hospitalmanagement.model.authentication;

@Service
public class PatientLoginService {
	
@Autowired
	 PatientLoginRepository patientloginrepository;

	 public authentication validatePatientLogin(String username,String password) {
		 authentication status = null;
		 P_Signup p = patientloginrepository.validatePatientLogin(username,password);
		 if (p!=null) {
			 status = new authentication(p.getP_username(), p.getP_password(),"active",true);
		 }
		 else {
			 status = new authentication(null, null,null,false);
		 }
		 return status;
	 }
}

