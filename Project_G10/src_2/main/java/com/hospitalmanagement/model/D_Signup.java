package com.hospitalmanagement.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="doctor_signup")
public class D_Signup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="d_id")
	private int d_id;
	
	@Column(name="d_name")
	private String d_name;
	
	@Column(name="d_gender")
	private String d_gender;
	
	@Column(name="d_contact_no")
	private int d_contact_no;
	
	@Column(name="d_specilisation")
	private String specilisation;
	
	
	@Column(name="d_username")
	private String d_username;
	
	@Column(name="d_password")
	private String d_password;
	
	@OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<P_Signup> patients;
	public D_Signup() {
		
		
	}
	public D_Signup(String d_name, String d_gender, int d_contact_no, String specilisation, String d_username,
			String d_password, Set<P_Signup> patients) {
		super();
		this.d_name = d_name;
		this.d_gender = d_gender;
		this.d_contact_no = d_contact_no;
		this.specilisation = specilisation;
		this.d_username = d_username;
		this.d_password = d_password;
		this.patients = patients;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getD_gender() {
		return d_gender;
	}
	public void setD_gender(String d_gender) {
		this.d_gender = d_gender;
	}
	public int getD_contact_no() {
		return d_contact_no;
	}
	public void setD_contact_no(int d_contact_no) {
		this.d_contact_no = d_contact_no;
	}
	public String getSpecilisation() {
		return specilisation;
	}
	public void setSpecilisation(String specilisation) {
		this.specilisation = specilisation;
	}
	public String getD_username() {
		return d_username;
	}
	public void setD_username(String d_username) {
		this.d_username = d_username;
	}
	public String getD_password() {
		return d_password;
	}
	public void setD_password(String d_password) {
		this.d_password = d_password;
	}
	public Set<P_Signup> getPatients() {
		return patients;
	}
	public void setPatients(Set<P_Signup> patients) {
		this.patients = patients;
	}

	
	

}