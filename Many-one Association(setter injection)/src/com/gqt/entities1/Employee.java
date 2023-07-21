package com.gqt.entities1;

public class Employee 
{
	//Instance variables
		private int empId;
		private String empName;
		
		//Has - a variable
		private Branch branch;
		
		

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public void setBranch(Branch branch) {
			this.branch = branch;

		}
		
		public String toString() {
			
			
			
			return "Employee details: "+'\n'+
					empId+'\n'+
					empName+'\n'+
					"Branch Details: "+'\n'+branch.getbId()+'\n'+
					branch.getbLoc()+'\n';

		}

}
