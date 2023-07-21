package com.gqt.entities;

public class Employee 
{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		
		this.empId = empId;
		this.empName = empName;
	}


	private Project[] projects;

	public Employee(int empId, String empName, Project...projects ) {
		
		this.empId = empId;
		this.empName = empName;
		this.projects = projects;
	}

	//setters
   
	

	/*public void setEmpId(int empId) {
		this.empId = empId;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	/*public void setProjects(Project... projects) {
		this.projects = projects;
	}*/
	//getters
	public int getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}

	public Project[] getProjects() {
		return projects;
	}
	
	 public void disp() {
		System.out.println("Employee Details");
		System.out.println(empId+" "+empName);
		System.out.println("Project Details");
		for (Project prj : projects)
		{
			System.out.println(prj.getpId()+" "+prj.getpName()+" "+prj.getpMgr());
			
		}
		System.out.println();
	}
	
}
