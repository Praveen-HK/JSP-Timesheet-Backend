package com.jspiders.TimeSheet.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.TimeSheet.Entity.Admin;
import com.jspiders.TimeSheet.Entity.Employee;
import com.jspiders.TimeSheet.Service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService service;

	@PostMapping("/addAdmin")
	public ResponseEntity<Object> SignUp(@RequestBody Admin a) {
		Object o = service.SignUp(a);
		if (o instanceof Admin) {
			return ResponseEntity.status(200).body("SignUp successfull");
		}
		return ResponseEntity.status(400).body(service.SignUp(a));
	}

	@GetMapping("/adminLogin")
	public ResponseEntity<Object> login(@RequestHeader("emailId") String a_email_id,
			@RequestHeader("password") String a_password) {
		Object o = service.login(a_email_id, a_password);
		if (o != null) {

			return ResponseEntity.status(200).body(o);
		} else {
			return ResponseEntity.status(400).body(o);
		}

	}

	@PostMapping("/AdminAddEmployee")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
		Object o = service.addEmployee(employee);
		if (o instanceof Employee) {
			return ResponseEntity.status(200).body("Employee Added Successfully");
		}
		return ResponseEntity.status(400).body(o);
	}

	@PutMapping("/editMangager")
	public ResponseEntity<Object> editManager(@RequestParam String emailId, @RequestHeader boolean e_manager) {
		Object o = service.editManager(emailId, e_manager);
		if (o instanceof Employee) {
			return ResponseEntity.status(200).body("Edit Successfull");
		}
		return ResponseEntity.status(400).body(o);
	}

	@GetMapping("/GetAllEmployee")
	public ArrayList<Employee> getAllEmployee(ArrayList<Employee> a) {

		return service.getAllEmployee();
	}

	@DeleteMapping("/deleteEmployee")
	public Object deleteEmployee(String eName, String emailId) {
		return service.deleteEmployee(eName, emailId);
	}
}
