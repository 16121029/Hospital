package com.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.model.Discharge;

@Repository

public interface DischargeRepository extends JpaRepository<	Discharge ,Integer>{
	

}