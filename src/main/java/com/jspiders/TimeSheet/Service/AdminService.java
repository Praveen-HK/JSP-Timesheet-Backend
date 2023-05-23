package com.jspiders.TimeSheet.Service;

import java.util.ArrayList;

import com.jspiders.TimeSheet.Entity.Admin;
import com.jspiders.TimeSheet.Entity.Employee;

public interface AdminService {

	Object SignUp(Admin a);

	Object login(String a_email_id, String a_password);

	Object addEmployee(Employee emp);

	Object editManager(String eName, boolean e_manager);
	
	Object deleteEmployee(String eName , String emailId);

	ArrayList<Employee> getAllEmployee();

}
