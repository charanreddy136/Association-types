package com.gqt.test2;

import com.gqt.entities1.Department;
import com.gqt.entities1.Employee;

public class Launch2
{
		public static void main(String[] args)
		{
			//creating dependent object
			Employee emp1 = new Employee(18,"sachin");
			Employee emp2 = new Employee(24,"dhoni");
			Employee emp3 = new Employee(42,"zabi");
			
			//Creating an array to perform one-many association
			Employee e[] =new Employee[3];
			
			e[0] = emp1;
			e[1] = emp2;
			e[2] = emp3;
			
			//creating Target object using Constructor
			Department d = new Department(123,"Bcci","Dubai",e);
			
			d.disp();

		}
}
