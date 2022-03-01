package com.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.model.D_Signup;


@Repository
public interface D_SignupRepository extends JpaRepository<D_Signup, Integer> {
	
	
	@Query("SELECT d FROM D_Signup d WHERE d.d_username =?1 and d.d_password=?2")
	public D_Signup validateUser(String username,String password);
	@Query("SELECT d FROM D_Signup d WHERE d.d_id =?1")
	public D_Signup validateDoctor(int d_id);

}