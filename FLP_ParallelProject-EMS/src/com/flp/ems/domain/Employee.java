package com.flp.ems.domain;

public class Employee {

	private String Name,Kin_Id, Email_id, Address, Department, Project, Roles, Phone_no;
    private String Doj;
	private String Dob;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getKin_Id() {
		return Kin_Id;
	}
	public void setKin_Id(String kin_Id) {
		this.Kin_Id = kin_Id;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		this.Email_id = email_id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		this.Department = department;
	}
	public String getProject() {
		return Project;
	}
	public void setProject(String project) {
		this.Project = project;
	}
	public String getRoles() {
		return Roles;
	}
	public void setRoles(String roles) {
		this.Roles = roles;
	}
	public String getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.Phone_no = phone_no;
	}
	public String getDoj() {
		return Doj;
	}
	public void setDoj(String doj) {
		this.Doj = doj;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		this.Dob = dob;
	}
	
}
