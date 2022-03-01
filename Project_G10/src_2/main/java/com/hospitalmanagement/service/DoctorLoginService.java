package com.hospitalmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.dao.DoctorLoginRepository;
import com.hospitalmanagement.model.D_Signup;
import com.hospitalmanagement.model.DoctorLogin;
import com.hospitalmanagement.model.authentication;

@Service
public class DoctorLoginService {
	
@Autowired
	 DoctorLoginRepository doctorloginrepository;

	 public authentication validateDoctorLogin(String username, String password) {
		 authentication status = null;
		 D_Signup doctor= doctorloginrepository.validateDoctorLogin(username, password);
		 if(doctor!=null) {
			 status = new authentication(doctor.getD_username(), doctor.getD_password(), "active", true);
		 }
		 else {
			 status = new authentication(null, null, null, false);
		 }
		 return status;
	 }
}