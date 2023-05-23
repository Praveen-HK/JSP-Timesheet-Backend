package com.jspiders.TimeSheet.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "batch_details")
public class Batch {
	@Id
	private String bt_id;
	private String bt_code;
	private long bt_no_of_students;
	private String bt_subject;
	private String bt_trainer_name;
	private Date bt_slot;
	private Date bt_start_date;
	private Date bt_end_date;
	private boolean bt_completed;

}
