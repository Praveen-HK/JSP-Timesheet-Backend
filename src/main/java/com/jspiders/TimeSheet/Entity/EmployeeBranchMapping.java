package com.jspiders.TimeSheet.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;


@Entity
public class EmployeeBranchMapping {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ebr_id;
	private String br_id;
	private String e_id;
}

