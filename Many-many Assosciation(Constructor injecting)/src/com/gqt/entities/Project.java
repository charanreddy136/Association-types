package com.gqt.entities;

public class Project
{
	private int pId;
	private String  pName;
	private String pMgr;
	
	private Employee [] employees;

	public Project(int pId, String pName, String pMgr, Employee...employees ) {
		
		this.pId = pId;
		this.pName = pName;
		this.pMgr = pMgr;
		this.employees = employees;
	}
	public Project(int pId, String pName, String pMgr) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pMgr = pMgr;
	}

	public int getpId() {
		return pId;
	}

	public String getpName() {
		return pName;
	}

	public String getpMgr() {
		return pMgr;
	}

	public Employee[] getEmployees() {
		return employees;
	}
	
	
	

	public void disp()
	{
		System.out.println("Project Details");
		System.out.println(pId+" "+pName+" "+pMgr);
		System.out.println("Employee Details");
		for (Employee emp : employees) 
		{
				System.out.println(emp.getEmpId()+" "+emp.getEmpName());
		}
		System.out.println();
	}
	
	
	
}
