package com.hospitalmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	@Id
	@Column(name="a_id")
	private int a_id;
	@Column(name="password")
	private String password;

	

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id =a_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

