package com.gqt.test3;

import com.gqt.entities3.Branch;
import com.gqt.entities3.Employee;

public class Launch3 
{
	public static void main(String[] args) 
	{
		Branch br = new Branch(6, "YLNK");  
		Employee emp1 = new Employee(18, "Sachin", br);
		Employee emp2 = new Employee(23, "Virat", br);
		Employee emp3 = new Employee(34, "Dhoni", br);
		
		emp1.disp();
		emp2.disp();
		emp3.disp();
		
	}

}
