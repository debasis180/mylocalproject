package com.flp.ems.view;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInteraction 
{
	Scanner sc2=new Scanner(System.in);
	private String Name,Kin_Id, Email_id, Address, Department, Project, Roles, Phone_no;
    private String Doj;
	private String Dob;

public void AddEmployee()
{
	
	 
    Map<String,String> bb=new HashMap<String,String>();
	
	System.out.println("enter Name");
	Name= sc2.next();
	System.out.println("enter Kin_Id");
	Kin_Id= sc2.next();
	System.out.println("enter Email_id");
	Email_id= sc2.next();
	System.out.println("enter Address");
	Address= sc2.next();
	System.out.println("enter Department");
	Department= sc2.next();
	System.out.println("enter Project");
	Project= sc2.next();
	System.out.println("enter Roles");
	Roles= sc2.next();
	System.out.println("enter Phone_no");
	Phone_no= sc2.next();
	System.out.println("enter Doj");
	Doj=sc2.next();
	System.out.println("enter Dob");
	Dob=sc2.next();
	
	bb.put("Name",Name);
	bb.put("Kin_Id",Kin_Id);
	bb.put("Email_id",Email_id);
	bb.put("Address",Address);
	bb.put("Department",Department);
	bb.put("Project",Project);
	bb.put("Roles",Roles);
	bb.put("Phone",Phone_no);
	bb.put("Date of Joining",Doj);
	bb.put("Date of Birth",Dob);
	System.out.println("HashMap created");
	System.out.println(bb);
	
}
public void ModifyEmployee(){
}
public void RemoveEmployee(){
}
public void SearchEmployee(){
}
public void GetAllEmployee(){
}

}




