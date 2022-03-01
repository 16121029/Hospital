package com.hospitalmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospitalmanagement.dao.AdminRepository;
import com.hospitalmanagement.model.Admin;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Transactional

	public Admin validateAdmin(Admin admin) {
		Admin a=adminRepository.validateAdmin(admin.getA_id(),admin.getPassword());
		
		return a;
	}
	
}
