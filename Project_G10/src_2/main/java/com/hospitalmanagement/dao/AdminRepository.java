package com.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hospitalmanagement.model.Admin;


public interface AdminRepository extends JpaRepository<Admin, String>{
	@Query("SELECT a FROM Admin a WHERE a.a_id =?1 and a.password=?2")
			public Admin validateAdmin(int userid,String password);

}
