package com.hospitalmanagement.dao;


import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.hospitalmanagement.model.P_Signup;

@Repository
public interface P_SignupRepository extends JpaRepository<P_Signup ,Integer>{
	@Query("SELECT p FROM P_Signup p WHERE p.p_username =?1 and p.p_password=?2")
	public P_Signup validateUser(String username,String password);
	
}