package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("EMP001", "Muzaki", 1000000));
		emp.add(new Employee("EMP002", "Anam", 2000000));
		emp.add(new Employee("EMP003", "Hasan", 3000000));

		System.out.println("Account List - Using ArrayList");
		for (Employee e : emp) {
			System.out.println(e.getAccountID() + " - " + e.getName() + " - " + e.getBalance());
		}

		Map<Employee> emp2 = new Map<>();
		emp2.put(new Employee("EMP004", "Husein", 1000000));
		emp2.put(new Employee("EMP005", "Albana", 2000000));
		emp2.put(new Employee("EMP006", "Allvin", 3000000));

		System.out.println(emp2);
	}
}
