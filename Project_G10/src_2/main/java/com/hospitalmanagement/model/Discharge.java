package com.hospitalmanagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="discharge")

public class Discharge {
	@Id
	@GeneratedValue
	@Column(name="a_id ")
	private int a_id ;
	
	@Column(name="P_ID ")
	private int p_id;
	@Column(name="P_ANAME")
	private String p_aname;
	@Column(name="P_AMID ")
	private String p_amid;
	@Column(name="GENDER  ")
	private String gender;
	@Column(name="D_ANAME")
	private String d_aname;
	@Column(name="DIS_DATE ")
	@Temporal(TemporalType. DATE)
	private Date dis_date  ;
	@Column(name="Dis_TIME ")
	private String dis_time ;
	
	public Discharge() {
	}



	public Discharge(int a_id, int p_id, String p_aname, String p_amid, String gender, String d_aname, Date dis_date,
			String dis_time) {
		super();
		this.a_id = a_id;
		this.p_id = p_id;
		this.p_aname = p_aname;
		this.p_amid = p_amid;
		this.gender = gender;
		this.d_aname = d_aname;
		this.dis_date = dis_date;
		this.dis_time = dis_time;
	}



	public int geta_id() {
		return a_id;
	}



	public void seta_id(int a_id) {
		this.a_id = a_id;
	}



	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_aname() {
		return p_aname;
	}

	public void setP_aname(String p_aname) {
		this.p_aname = p_aname;
	}

	public String getP_amid() {
		return p_amid;
	}

	public void setP_amid(String p_amid) {
		this.p_amid = p_amid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getD_aname() {
		return d_aname;
	}

	public void setD_aname(String d_aname) {
		this.d_aname = d_aname;
	}

	public Date getDis_date() {
		return dis_date;
	}

	public void setDis_date(Date dis_date) {
		this.dis_date = dis_date;
	}

	public String getDis_time() {
		return dis_time;
	}

	public void setDis_time(String dis_time) {
		this.dis_time = dis_time;
	}
	
	
	
	}

