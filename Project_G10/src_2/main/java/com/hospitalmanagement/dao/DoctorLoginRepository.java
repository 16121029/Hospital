package com.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hospitalmanagement.model.D_Signup;
import com.hospitalmanagement.model.DoctorLogin;

public interface DoctorLoginRepository extends JpaRepository<DoctorLogin, String> {
	@Query("SELECT dl FROM D_Signup dl WHERE dl.d_username =?1 and dl.d_password=?2")
	
	public D_Signup validateDoctorLogin(String username, String password);

}
