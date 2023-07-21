package com.gqt.entities3;

public class Project
{
	private int pId;
	private String  pName;
	private String pMgr;
	
	private Employee [] employees;

	public void setpId(int pId) {
		this.pId = pId;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setpMgr(String pMgr) {
		this.pMgr = pMgr;
	}

	public void setEmployees(Employee[]  employees) {
		this.employees = employees;
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

	public Employee[]  getEmployees() {
		return employees;
	}
	

	
}
