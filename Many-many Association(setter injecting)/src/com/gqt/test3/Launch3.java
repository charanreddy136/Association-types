package com.gqt.test3;

import com.gqt.entities3.Employee;
import com.gqt.entities3.Project;

public class Launch3 
{
	public static void main(String[] args)
	{
				Project project1 = new Project();
				Project project2 = new Project();
				Project project3 = new Project();
				
				project1.setpId(11);
				project1.setpName("vendorlink");
				project1.setpMgr("senthil");
				
				project2.setpId(12);
				project2.setpName("maya");
				project2.setpMgr("ramana");
				
				project3.setpId(13);
				project3.setpName("loves");
				project3.setpMgr("abhishek");
				
				Employee employee1 = new Employee();
				Employee employee2 = new Employee();
				Employee employee3 = new Employee();
				
				employee1.setEmpId(23);
				employee1.setEmpName("nandish");
				employee1.setProjects(project1,project2);
				
				employee2.setEmpId(24);
				employee2.setEmpName("shafi");
				employee2.setProjects(project2,project3);
				
				employee3.setEmpId(36);
				employee3.setEmpName("sneha");
				employee3.setProjects(project1,project2,project3);
				
				System.out.println(employee1);
				System.out.println(employee2);
				System.out.println(employee3);
			}
}
