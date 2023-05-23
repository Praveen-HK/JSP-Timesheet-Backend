package com.jspiders.TimeSheet.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "branch_details")
public class Branch {

	@Id
	private String br_id;
	private String br_name;
	private long br_no_students;
	private long br_no_students_placed;
	private String br_manager_id;

}
