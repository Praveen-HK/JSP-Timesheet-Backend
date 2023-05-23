package com.jspiders.TimeSheet.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class IdGenerator {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
}
