package com.flp.ems.service;
import java.util.Map;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.flp.ems.view.UserInteraction;

public class EmployeeServiceImpl implements IEmployeeService {
	EmployeeServiceImpl dj=new EmployeeServiceImpl();
	Employee rj=new Employee();
	Department vj=new Department();
	Project pj=new Project();
	Role cj=new Role();
	 UserInteraction i=new UserInteraction();
	/*@Override*/
	public void AddEmployee(Map bb) {
		rj.setName((String)bb.get("Name"));
		rj.setKin_Id((String)bb.get("Kin_Id"));
		rj.setEmail_id((String)bb.get("Email_id"));
		rj.setAddress((String)bb.get("Address"));
		rj.setDoj((String)bb.get("Doj"));
		rj.setPhone_no((String)bb.get("Phone_no"));
		rj.setDob((String)bb.get("Dob"));
		vj.setDepartment_id((int)bb.get("Department_id"));
		vj.setName((String)bb.get("Name"));
		vj.setDescription((String)bb.get("Description"));
		pj.setDepartment_id((int)bb.get("Department_id"));
		pj.setDescription((String)bb.get("Description"));
		pj.setName((String)bb.get("Name"));
		pj.setProject_id((int)bb.get("Project_id"));
		cj.setDescription((String)bb.get("Description"));
		cj.setName((String)bb.get("Name"));
		cj.setRole_id((int)bb.get("Role_id"));
		
		
	}
	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void SearchEmployee() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void GetAllEmployee() {
		// TODO Auto-generated method stub
		
	}
	

}
