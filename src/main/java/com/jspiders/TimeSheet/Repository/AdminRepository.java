package com.jspiders.TimeSheet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jspiders.TimeSheet.Entity.Admin;
import com.jspiders.TimeSheet.Entity.Employee;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	@Query(value = "select * from admin_details where a_email_id=?1", nativeQuery = true)
	Admin findByemail(String a_email_id);

	@Query(value = "select * from admin_details where a_phno=?1", nativeQuery = true)
	Admin findByPhno(long a_phno);

	@Query(value = "select * from admin_details where a_username=?1", nativeQuery = true)
	Admin findByUsername(String a_username);

}
