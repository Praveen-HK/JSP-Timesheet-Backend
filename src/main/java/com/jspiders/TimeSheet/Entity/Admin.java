package com.jspiders.TimeSheet.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin_details")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String a_username;
	private String a_email_id;
	private String a_password;
	private long a_phno;

	public Admin() {
	}

	public Admin(String a_username, String a_email_id, String a_password, long a_phno) {
		super();
		this.a_username = a_username;
		this.a_email_id = a_email_id;
		this.a_password = a_password;
		this.a_phno = a_phno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getA_username() {
		return a_username;
	}

	public void setA_username(String a_username) {
		this.a_username = a_username;
	}

	public String getA_email_id() {
		return a_email_id;
	}

	public void setA_email_id(String a_email_id) {
		this.a_email_id = a_email_id;
	}

	public String getA_password() {
		return a_password;
	}

	public void setA_password(String a_password) {
		this.a_password = a_password;
	}

	public long getA_phno() {
		return a_phno;
	}

	public void setA_phno(long a_phno) {
		this.a_phno = a_phno;
	}
}