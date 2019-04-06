package com.java8.test.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortExample {

	public static List<Employee> getEmployees(){
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Sam", 33));
		employeeList.add(new Employee("John", 28));
		employeeList.add(new Employee("Jane", 23));
		employeeList.add(new Employee("Alice", 29));
		employeeList.add(new Employee("Alice", 21));
		return employeeList;
	}
	
	public static void main(String[] args) {
		List<Employee> employeeList  = getEmployees();
		//Method 1
		/*
		employeeList.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
		*/
		//Method 2
		/*
		Comparator<Employee> employeeNameComparator = Comparator.comparing(Employee::getName);
		employeeList.sort(employeeNameComparator);
		*/
		//Method 3
		/*
		Comparator<Employee> employeeAgeComparator = Comparator.comparing(Employee::getAge);
		Comparator<Employee> employeeAgeComparatorReversed = employeeAgeComparator.reversed();
		employeeList.sort(employeeAgeComparatorReversed);
		*/
		//Method 4
		Comparator<Employee> employeeNameThenAgeComparator = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
		employeeList.sort(employeeNameThenAgeComparator);
		employeeList.forEach(employee->System.out.println(employee));
	}

}
