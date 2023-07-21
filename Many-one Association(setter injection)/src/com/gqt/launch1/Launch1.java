package com.gqt.launch1;

import com.gqt.entities1.Branch;
import com.gqt.entities1.Employee;

public class Launch1 {

	public static void main(String[] args) {
		
		
		          
			      Branch b= new Branch();
			   	  b.setbId(6);
				  b.setbLoc("YLNK");
					
				Employee emp1 = new Employee();
				emp1.setEmpId(18);
				emp1.setEmpName("sachin");
				emp1.setBranch(b);
				
				Employee emp2 = new Employee();
				emp2.setEmpId(24);
				emp2.setEmpName("virat");
				emp2.setBranch(b);
				
				Employee emp3 = new Employee();
				emp3.setEmpId(1);
				emp3.setEmpName("Zabi");
				emp3.setBranch(b);
				
				System.out.println(emp1);
				System.out.println(emp2);
				System.out.println(emp3);
				
				
				
			}


	}


