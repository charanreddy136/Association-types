package com.gqt.test;

import com.gqt.entities.Account;
import com.gqt.entities.Employee;

public class Launch 
{
	public static void main(String[] args) 
	{
		Account a = new Account(1218, "Saving","charan");
		Employee emp = new Employee(118, "charan", "Banglore", a);
		emp.disp();

	}

}
