package com.java8.test.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class ComparatorExample {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	private static Comparator<Employee> employeeNameComparator = Comparator.comparing(Employee::getName);
	private static Comparator<Employee> employeeAgeComparator = Comparator.comparing(Employee::getAge);
	
	public static List<Employee> getEmployees(){
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Sam", 33));
		employeeList.add(new Employee("John", 28));
		employeeList.add(new Employee("Jane", 23));
		employeeList.add(new Employee("Alice", 29));
		employeeList.add(new Employee("Alice", 21));
		return employeeList;
	}
	
	public static void main(String[] args) {
		List<Employee> employeeList1  = getEmployees();
		//Method 1
		employeeList1.sort(employeeAgeComparator);
		LOGGER.info("SORT: METHOD1: "+employeeList1);
		//Method 2
		List<Employee> employeeList2  = getEmployees();
		employeeList2.sort(employeeNameComparator);
		LOGGER.info("SORT: METHOD2: "+employeeList2);
		//Method 3
		List<Employee> employeeList3  = getEmployees();
		Comparator<Employee> employeeAgeComparatorReversed = employeeAgeComparator.reversed();
		employeeList3.sort(employeeAgeComparatorReversed);
		LOGGER.info("SORT: METHOD3: "+employeeList3);
		//Method 4
		List<Employee> employeeList4  = getEmployees();
		Comparator<Employee> employeeNameThenAgeComparator = employeeNameComparator.thenComparing(employeeAgeComparator);
		employeeList4.sort(employeeNameThenAgeComparator);
		LOGGER.info("SORT: METHOD4: "+employeeList4);
	}	

}
