package com.gqt.test;

import com.gqt.entities.Employee;
import com.gqt.entities.Project;

public class Launch 
{
	public static void main(String[] args) 
	{	
		
		/*Project prj1 = new Project(3, "vendorLink", "Senthil");
		Project prj2 = new Project(7, "Maya", "Ramana");
		Project prj3 = new Project(11, "Loves", "Abhishek");
		Employee emp1 = new Employee(18, "Nandish");
		Employee emp2 = new Employee(26, "Shafi");
		Employee emp3 = new Employee(32, "Sneha");
		*/

		Employee emp1 = new Employee(23,"nandish");
		Employee emp2 = new Employee(26,"shafi");
		Employee emp3 = new Employee(32,"sneha");
		Project prj1 = new Project(3, "vendorLink", "Senthil", emp1,emp3); 
		Project prj2 = new Project(7, "Maya", "Ramana", emp1,emp2,emp3);
		Project prj3 = new Project(11, "Loves", "Abhishek", emp2,emp3 );
		
		
		/*
		Employee emp1 = new Employee(23,"nandish",prj1,prj2);
		Employee emp2 = new Employee(26,"shafi",prj2,prj3);
		Employee emp3 = new Employee(32,"sneha",prj1,prj2,prj3);
		
		emp1.disp();
		emp2.disp();
		emp3.disp();
		

		Employee emp1 = new Employee();
		emp1.setEmpId(18);
		emp1.setEmpName("Nandish");
		Employee emp2 = new Employee();
		emp2.setEmpId(26);
		emp2.setEmpName("Shafi");
		Employee emp3 = new Employee();
		emp3.setEmpId(32);
		emp3.setEmpName("Sneha");
		*/
		prj1.disp();
	    prj2.disp();
	    prj3.disp();
		
		
		
		
		
		
	}

}
