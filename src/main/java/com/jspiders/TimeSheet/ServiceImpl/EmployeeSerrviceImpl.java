package com.jspiders.TimeSheet.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.jspiders.TimeSheet.Entity.Employee;
import com.jspiders.TimeSheet.Entity.IdGenerator;
import com.jspiders.TimeSheet.Repository.EmployeeRepository;
import com.jspiders.TimeSheet.Repository.IdGeneratorRepo;
import com.jspiders.TimeSheet.Service.EmployeeService;

@Service
public class EmployeeSerrviceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	@Autowired
	private IdGeneratorRepo idRepo; 

	@Override
	public Employee AddEmployee( Employee e) {
		idRepo.save(new IdGenerator());
		e.setE_id("JSP"+idRepo.count());
		return repo.save(e);	
}
}