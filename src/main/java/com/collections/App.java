package com.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		Employee muzaki = new Employee("EMP001", "Muzaki", 1000_000);
		Employee anam = new Employee("EMP002", "Anam", 2000_000);
		Employee hasan = new Employee("EMP003", "Hasan", 3000_000);
		
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(muzaki);
		empList.add(anam);
		empList.add(hasan);
		System.out.println("Account List - Using ArrayList");
		for (Employee e : empList) {
			System.out.println(e.getAccountID() + " - " + e.getName() + " - " + e.getBalance());
		}
		System.out.println("===============================");

		Map<String, Employee> empMap = new LinkedHashMap<>();
		empMap.put("A1", muzaki);
		empMap.put("A2", anam);
		empMap.put("A3", hasan);
		System.out.println("Account List - Using Map");
		empMap.forEach((key, employee) -> {
			System.out.println(employee.getAccountID() + " - " + employee.getName() + " - " + employee.getBalance());
		});
		System.out.println("===============================");

		Set<Employee> empSet = new HashSet<>();
		empSet.add(muzaki);
		empSet.add(hasan);
		empSet.add(anam);
		System.out.println("Account List - Using Set");
		for (Employee e : empSet) {
			System.out.println(e.getAccountID() + " - " + e.getName() + " - " + e.getBalance());
		}
		System.out.println("===============================");

		Queue<Employee> empQue = new ArrayDeque<>();
		empQue.add(muzaki);
		empQue.add(hasan);
		empQue.add(anam);
		System.out.println("Account List - Using Queue");
		for (Employee e : empQue) {
			System.out.println(e.getAccountID() + " - " + e.getName() + " - " + e.getBalance());
		}
		System.out.println("===============================");

	}
}
