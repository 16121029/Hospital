package com.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hospitalmanagement.model.DoctorLogin;
import com.hospitalmanagement.model.P_Signup;
import com.hospitalmanagement.model.PatientLogin;
import com.hospitalmanagement.model.authentication;

public interface PatientLoginRepository extends JpaRepository<P_Signup, String> {
	@Query("SELECT pl FROM P_Signup pl WHERE pl.p_username =?1 and pl.p_password=?2")
	
	public P_Signup validatePatientLogin(String p_username , String p_password);

}
