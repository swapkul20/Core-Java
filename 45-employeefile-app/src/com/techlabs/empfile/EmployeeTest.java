package com.techlabs.empfile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeFileProcessor processor=new EmployeeFileProcessor();
		try {
			List <Employee> employees=null;
			Scanner sc=new Scanner(System.in);
			int choice=0;
			while(choice!=7)
			{
				System.out.println("1. Fetch Employees from file");
				System.out.println("2. Display all Employees");
				System.out.println("3. Display Employees  with highest salaries");
				System.out.println("4. Display Employees by department");
				System.out.println("5. Display total payment");
				System.out.println("6. Employees joined between ....");
				System.out.println("7. Exit");
				System.out.println("Enter you choice");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:employees=processor.fetchEmployees("D:\\files/emp.txt");
				       break;
				case 2:processor.display(employees);
				       break;
				case 3:processor.displayEmployeeWithHighestSalaries(employees);
				       break;
				case 4:processor.dislayEmployeeDepartally(employees);
				       break;
				case 5:System.out.println("Total Payment:"+processor.calculateTotalPayment(employees));
				       break;
				case 6:System.out.println("Enter start date:dd-MMM-yy");
				       String start=sc.next();
				       Date startdate=new SimpleDateFormat("dd-MMM-yyyy").parse(start);
				       System.out.println("Enter end date:dd-MMM-yy");
				       String end=sc.next();
				       Date enddate=new SimpleDateFormat("dd-MMM-yyyy").parse(end);
				       processor.findEmployeesJoinedBetween(employees,startdate,enddate);
				       break;
				}
				
			}
		   
		   		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
