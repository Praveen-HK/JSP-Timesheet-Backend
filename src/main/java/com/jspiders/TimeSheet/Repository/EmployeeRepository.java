package com.jspiders.TimeSheet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jspiders.TimeSheet.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value = "select * from employee_details where e_name=?1", nativeQuery = true)
	Employee findByName(String eNmae);

	@Query(value = "select * from employee_details where e_email_id=?1", nativeQuery = true)
	Employee findByEmail(String emailId);

	@Query(value = "select * from employee_details where e_phno=?1", nativeQuery = true)
	Employee findByPhno(long ePhno);

	@Query(value = "DELETE FROM  employee_details where e_name=?1", nativeQuery = true)
	Employee deleteByEname(String userName);
}
