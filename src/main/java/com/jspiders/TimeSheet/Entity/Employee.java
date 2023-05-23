package com.jspiders.TimeSheet.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_details")
public class Employee {

	@Id
	private String e_id;
	private String e_name;
	private long e_phno;
	private String e_designation;
	private String e_email_id;
	private String e_password;
	private String[] e_skills;
	private boolean e_manager;
	private String e_my_manager;

	@Column(columnDefinition = "MEDIUMBLOB", length = 16777215)
	private byte[] profile_pic;

	public String getE_id() {
		return e_id;
	}

	public void setE_id(String e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public long getE_phno() {
		return e_phno;
	}

	public void setE_phno(long e_phno) {
		this.e_phno = e_phno;
	}

	public String getE_designation() {
		return e_designation;
	}

	public void setE_designation(String e_designation) {
		this.e_designation = e_designation;
	}

	public String getE_email_id() {
		return e_email_id;
	}

	public void setE_email_id(String e_email_id) {
		this.e_email_id = e_email_id;
	}

	public String getE_password() {
		return e_password;
	}

	public void setE_password(String e_password) {
		this.e_password = e_password;
	}

	public String[] getE_skills() {
		return e_skills;
	}

	public void setE_skills(String[] e_skills) {
		this.e_skills = e_skills;
	}

	public boolean isE_manager() {
		return e_manager;
	}

	public void setE_manager(boolean e_manager) {
		this.e_manager = e_manager;
	}

	public String getE_my_manager() {
		return e_my_manager;
	}

	public void setE_my_manager(String e_my_manager) {
		this.e_my_manager = e_my_manager;
	}

	public byte[] getProfile_pic() {
		return profile_pic;
	}

	public void setProfile_pic(byte[] profile_pic) {
		this.profile_pic = profile_pic;
	}
	
	

}
