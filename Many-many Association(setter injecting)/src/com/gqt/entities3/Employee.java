package com.gqt.entities3;


public class Employee
{
	private int empId;
	private String empName;
	
	private Project[] projects;
	String data="";

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setProjects(Project...projects ) {
		this.projects = projects;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Project[] getProjects() {
		return projects;
	}
	
	
	
     public String toString() {
		
		for(Project project : projects) {
			data = data+project.getpId();
			data = data+" ";
			data = data+project.getpName();
			data = data+" ";
			data = data+project.getpMgr()+'\n';
			
		}
		
		
		return "Employee Details: "+" "+
				empId+'\n'+
				empName+'\n'+
				"Project Details: "+'\n'+data;
     }
}
