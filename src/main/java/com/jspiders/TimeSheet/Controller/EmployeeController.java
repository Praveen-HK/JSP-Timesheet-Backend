package com.jspiders.TimeSheet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.TimeSheet.Entity.Employee;
import com.jspiders.TimeSheet.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/addEmployee")
	public Employee AddEmployee(@RequestBody Employee e) {

		return service.AddEmployee(e);

	}
}
