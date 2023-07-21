package com.gqt.entities2;


public class Department
{
	//instance variables
	private int deptId;
	private String deptName;
	private String deptLoc;
	//has-a variable
	private Employee [] employees;
	private String data="";
	public void setDeptId(int deptId)
	{
		this.deptId = deptId;
	}
	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}
	public void setDeptLoc(String deptLoc)
	{
		this.deptLoc = deptLoc;
	}
	public void setEmployees(Employee[] employee)
	{
		this.employees = employee;
	}
	
	
	
	
	public String toString() 
	{
		 for(Employee emp: employees)
		 {
			  data= data +emp.getEmpId();
			  data =data+'\n';
			  data= data +emp.getEmpName();
			  data =data+'\n';
		 }
		
		return "Department Details:" + '\n' + deptId +
				'\n' + deptName + '\n' +
				deptLoc + '\n' + 
				'\n' + "Employees Details :" +
				'\n' + data;
		
	}
	
}