package com.hospitalmanagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="appointment")
public class Appointment {

	@Id
	@GeneratedValue
	@Column(name="AP_ID ")
	private int ap_id ;
	
	@Column(name="P_NAME")
	private String p_name;
	@Column(name="CITY  ")
	private String city;
	@Column(name="GENDER  ")
	private String gender;
	@Column(name="AP_DATE ")
	@Temporal(TemporalType. DATE)
	private Date ap_date  ;
	@Column(name="AP_TIME ")
	private String ap_time ;
	@Column(name="AP_STATUS ")
	private String status ;
	@Column(name="symptoms ")
	private String symptoms ;
	
	public Appointment()
	{
		
	}

	public Appointment(String p_name, String city, String gender, Date ap_date, String ap_time, String status,
			String symptoms) {
		super();
		this.p_name = p_name;
		this.city = city;
		this.gender = gender;
		this.ap_date = ap_date;
		this.ap_time = ap_time;
		this.status = status;
		this.symptoms = symptoms;
	}

	public int getAp_id() {
		return ap_id;
	}

	public void setAp_id(int ap_id) {
		this.ap_id = ap_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getAp_date() {
		return ap_date;
	}

	public void setAp_date(Date ap_date) {
		this.ap_date = ap_date;
	}

	public String getAp_time() {
		return ap_time;
	}

	public void setAp_time(String ap_time) {
		this.ap_time = ap_time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}


	

	


}

