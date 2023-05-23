package com.jspiders.TimeSheet.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.jspiders.TimeSheet.Entity.Admin;
import com.jspiders.TimeSheet.Entity.Employee;
import com.jspiders.TimeSheet.Exceptions.EmailAlreadyExistsException;
import com.jspiders.TimeSheet.Exceptions.EmailNotFoundException;
import com.jspiders.TimeSheet.Exceptions.PasswordInvalidExceptions;
import com.jspiders.TimeSheet.Exceptions.PhoneNumberAlreadyExistsException;
import com.jspiders.TimeSheet.Exceptions.UsernameAlreadyExists;
import com.jspiders.TimeSheet.Repository.AdminRepository;
import com.jspiders.TimeSheet.Repository.EmployeeRepository;
import com.jspiders.TimeSheet.Service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Override
	public Object SignUp(Admin a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object login(String a_email_id, String a_password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object editManager(String eName, boolean e_manager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object deleteEmployee(String eName, String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Autowired
//	private AdminRepository repo;
//
//	@Autowired
//	private EmployeeRepository eRepo;
//
//	BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
//
//	@Override
//	public Object SignUp(Admin a) {
//		Admin a1 = repo.findByemail(a.getA_email_id());
//		Admin a2 = repo.findByPhno(a.getA_phno());
//		Admin a3 = repo.findByUsername(a.getA_username());
//		if (a1 instanceof Admin) {
//			try {
//				throw new EmailAlreadyExistsException();
//			} catch (EmailAlreadyExistsException e) {
//				return e.getMessage();
//			}
//		}
//		if (a2 instanceof Admin) {
//			try {
//				throw new PhoneNumberAlreadyExistsException();
//			} catch (PhoneNumberAlreadyExistsException p) {
//				return p.getMessage();
//			}
//		}
//		if (a3 instanceof Admin) {
//			try {
//				throw new UsernameAlreadyExists();
//			} catch (UsernameAlreadyExists u) {
//				return u.getMessage();
//			}
//
//		} else {
//			String p = bcrypt.encode(a.getA_password());
//			a.setA_password(p);
//			return repo.save(a);
//		}
//	}
//
//	@Override
//	public Object login(String a_email_id, String a_password) {
//		Admin a1 = repo.findByemail(a_email_id);
//
//		if (a1 instanceof Admin && a1.getA_email_id().equalsIgnoreCase(a_email_id)) {
//			if (bcrypt.matches(a_password, a1.getA_password())) {
//				Object o = a1.getA_username();
//				ArrayList<Object> a = new ArrayList<Object>();
//				a.add(o);
//				return o;
//			} else {
//				try {
//					throw new PasswordInvalidExceptions();
//				} catch (PasswordInvalidExceptions p) {
//					return p.getMessage();
//				}
//			}
//		} else {
//			try {
//				throw new EmailNotFoundException();
//			} catch (EmailNotFoundException e) {
//				return e.getMessage();
//			}
//		}
//	}
//
//	@Override
//	public Object addEmployee(Employee employee) {
//
//		Employee e = eRepo.findByEmail(employee.getE_email_id());
//		if (e instanceof Employee) {
//			try {
//				throw new EmailAlreadyExistsException();
//			} catch (EmailAlreadyExistsException ee) {
//				return ee.getMessage();
//			}
//		} else {
//			String p = bcrypt.encode(employee.getE_password());
//			employee.setE_password(p);
//			return eRepo.save(employee);
//		}
//	}
//
//	@Override
//	public Object editManager(String emailId, boolean e_manager) {
//		Employee e = eRepo.findByEmail(emailId);
//		if (e instanceof Employee && e.getE_email_id().equalsIgnoreCase(emailId)) {
//			e.setE_manager(e_manager);
//			return eRepo.save(e);
//		} else {
//			try {
//				throw new EmailNotFoundException();
//			} catch (EmailNotFoundException e1) {
//				return e1.getMessage();
//			}
//		}
//	}
//
//	@Override
//	public ArrayList<Employee> getAllEmployee() {
//		Employee e = new Employee();
////		e.getE_branch();
//		e.getE_phno();
//		ArrayList<Employee> a = new ArrayList<Employee>();
//		a.add(e);
//		eRepo.findAll();
//		return a;
//	}
//
//	@Override
//	public Object deleteEmployee(String eName, String emailId) {
////		Employee e1 = new Employee();
//		Employee e = eRepo.findByEmail(emailId);
//		if (e instanceof Employee) {
//			return eRepo.deleteByEname(eName);
//		}
//		return "not deleted";
//	}

}
