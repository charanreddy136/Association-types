package com.gqt.test2;

import com.gqt.entities2.Department;
import com.gqt.entities2.Employee;

public class Launch2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpId(18);
		emp1.setEmpName("Sachin");
		Employee emp2 = new Employee();
		emp2.setEmpId(24);
		emp2.setEmpName("virat");
		Employee emp3 = new Employee();
		emp3.setEmpId(42);
		emp3.setEmpName("zabi");
		 Employee[] e = new Employee[3];
		 e[0]=emp1;
		 e[1]=emp2;
		 e[2]=emp3;
		 Department dept = new Department();
		 dept.setDeptId(123);
		 dept.setDeptName("Bcci");
		 dept.setDeptLoc("Dubai");
		 dept.setEmployees(e);
		 
		 System.out.println(dept);
		
	}

}
