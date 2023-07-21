package com.gqt.entities1;

public class Department {
	// instance variables
	private int deptId;
	private String deptName;
	private String deptLoc;

	// Has-a variable
	private Employee[] employees;

	public Department(int deptId, String deptName, String deptLoc, Employee[] employees) {

		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLoc = deptLoc;

		// Has-a variable injection through constructor
		this.employees = employees;

	}

	

	// rendering message to the user
	public void disp() {
			System.out.println("Department details:");
			System.out.println(deptId);
			System.out.println(deptName);
			System.out.println(deptLoc);
			System.out.println();
			System.out.println("Employee details: ");
			
			for(Employee emp : employees) {
				System.out.println(emp.getEmpId());
				System.out.println(emp.getEmpName());
			}
	}
}
