package com.flp.ems.view;
import java.util.Scanner;
public class BootClass 
{
    static Scanner sc1=new Scanner(System.in);
	public static void main(String []args) 
	{
		BootClass.menuSelection();
	}
    public static void menuSelection()
{
    UserInteraction i=new UserInteraction();
	
	System.out.println("Main Menu");
	System.out.println("enter your choice");
	System.out.println("1. Add\n 2.Modify\n 3.Remove\n 4.Search\n 5.Get All");
	int db;
	db=sc1.nextInt(); 
	switch(db)
	{
	case 1: i.AddEmployee();
	       break;
	case 2: i.ModifyEmployee();
	       break;
	case 3: i.RemoveEmployee();
			break;
	case 4: i.SearchEmployee();
	        break;
	case 5: i.GetAllEmployee();
	        break;
	default:System.out.println("invalid choice");
	break;
	}
}
}

