package com.hospitalmanagement.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="patient_signup")
public class P_Signup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="p_id")
	private int p_id;
	
	@Column(name="dob")
	@Temporal(TemporalType. DATE) 
	private Date dob;
	
	@Column(name="p_gender")
	private String p_gender;
	
	@Column(name="p_contact_no")
	private int p_contact_no;
	
	@Column(name="p_username")
	private String p_username;
	
	@Column(name="p_password")
	private String p_password;
	
	@Column(name="p_name")
	private String p_name;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "in_id")
	private Invoice invoice;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "d_id")
	private D_Signup doctor;
	public P_Signup()
	{
		
	}
	
	public P_Signup(int p_id, Date dob, String p_gender, int p_contact_no, String p_username, String p_password,
			String p_name, Invoice invoice, D_Signup doctor) {
		super();
		this.p_id = p_id;
		this.dob = dob;
		this.p_gender = p_gender;
		this.p_contact_no = p_contact_no;
		this.p_username = p_username;
		this.p_password = p_password;
		this.p_name = p_name;
		this.invoice = invoice;
		this.doctor = doctor;
	}
	

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getP_gender() {
		return p_gender;
	}
	public void setP_gender(String p_gender) {
		this.p_gender = p_gender;
	}
	public int getP_contact_no() {
		return p_contact_no;
	}
	public void setP_contact_no(int p_contact_no) {
		this.p_contact_no = p_contact_no;
	}
	public String getP_username() {
		return p_username;
	}
	public void setP_username(String p_username) {
		this.p_username = p_username;
	}
	public String getP_password() {
		return p_password;
	}
	public void setP_password(String p_password) {
		this.p_password = p_password;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public D_Signup getDoctor() {
		return doctor;
	}
	public void setDoctor(D_Signup doctor) {
		this.doctor = doctor;
	}

	
		
}
