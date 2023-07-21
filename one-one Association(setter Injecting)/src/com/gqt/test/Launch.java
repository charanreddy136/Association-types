package com.gqt.test;

import com.gqt.entities.Account;
import com.gqt.entities.Employee;

public class Launch {

	public static void main(String[] args) {
		Account a = new Account();
		a.setAccNo(1218);
		a.setAccType("savings");
		a.setAccName("Charan");
		
		
		Employee emp = new Employee();
		emp.setEmpId(118);
		emp.setEmpName("charan");
		emp.setEmpAddr("Banglore");
		
		//performing dependency Injection using Setter
		emp.setAcc(a);
		System.out.println(emp);


	}

}
