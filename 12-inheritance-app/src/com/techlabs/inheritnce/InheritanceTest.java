package com.techlabs.inheritnce;

public class InheritanceTest {

	public static void main(String[] args) {
		Student student1 = new Student("AAA", "AAA", 10, 80.5);
		Employee employee1 = new Employee("BBB", "BBB", "BB05", 55000);

		printStudemtDetails(student1);
		printEmployeeDetials(employee1);
	}

	private static void printEmployeeDetials(Employee employee) {
		System.out.println("Emolpoyee Information");
		System.out.println("Name:" + employee.getName());
		System.out.println("Address:" + employee.getAddress());
		System.out.println("Employee ID: " + employee.getId());
		System.out.println("Salary:" + employee.getSalary());
	}

	private static void printStudemtDetails(Student student) {
		System.out.println("Student Information");
		System.out.println("Name:" + student.getName());
		System.out.println("Address:" + student.getAddress());
		System.out.println("Roll Number: " + student.getRno());
		System.out.println("Percentage:" + student.getPerc());
	}

}
