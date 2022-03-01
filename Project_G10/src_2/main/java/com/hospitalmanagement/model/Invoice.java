package com.hospitalmanagement.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="invoice")


public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="IN_ID ")
	private int in_id;
	@Column(name="name ")
	private String name;
	@Column(name="IN_DATE ")
	@Temporal(TemporalType. DATE) 
	private Date in_date  ;
	@Column(name="OUT_DATE ")
	@Temporal(TemporalType. DATE) 
	private Date out_date;
	@Column(name="FEE ")
	private long fee;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "invoice")
	private P_Signup p_Signup;
	
	public Invoice(){
}

	public Invoice(String name, Date in_date, Date out_date, long fee, P_Signup p_Signup) {
		super();
		this.name = name;
		this.in_date = in_date;
		this.out_date = out_date;
		this.fee = fee;
		this.p_Signup = p_Signup;
	}

	public int getIn_id() {
		return in_id;
	}

	public void setIn_id(int in_id) {
		this.in_id = in_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getIn_date() {
		return in_date;
	}

	public void setIn_date(Date in_date) {
		this.in_date = in_date;
	}

	public Date getOut_date() {
		return out_date;
	}

	public void setOut_date(Date out_date) {
		this.out_date = out_date;
	}

	public long getFee() {
		return fee;
	}

	public void setFee(long fee) {
		this.fee = fee;
	}

	public P_Signup getP_Signup() {
		return p_Signup;
	}

	public void setP_Signup(P_Signup p_Signup) {
		this.p_Signup = p_Signup;
	}

	


	
}


