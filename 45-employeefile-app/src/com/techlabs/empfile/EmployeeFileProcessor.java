package com.techlabs.empfile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeFileProcessor {
	List<Employee> employees;
	
	public EmployeeFileProcessor() {
		employees=new ArrayList<Employee>();
	}
	public List<Employee> fetchEmployees(String pathname) throws Exception
	{
		Stream<String> filestream=Files.lines(Paths.get(pathname));
		List<String[]> lines=filestream.map(line->line.split(",")).collect(Collectors.toList());
		for(String[] line:lines)
	    {
	    	int id=Integer.parseInt(line[0]);
	    	String empname=line[1].replaceAll("^(['\'])(.*)\\1$", "$2");
	    	String designation=line[2].replaceAll("^(['\'])(.*)\\1$", "$2");
	    	String managerstring=line[3];
	    	int managerid;
	    	if(managerstring.contentEquals("NULL"))
	    		managerid=0;
	    	else
	    	    managerid=Integer.parseInt(line[3]);
	    	String datestring=line[4].replaceAll("^(['\'])(.*)\\1$", "$2");
	    	Date joining=new SimpleDateFormat("dd-MMM-yyyy").parse(datestring);
	    	double salary=Double.parseDouble(line[5]);
	    	String commissionstring=line[6];
	    	double commission;
	    	if(commissionstring.equals("NULL"))
	    		commission=0;
	    	else
	    		commission=Double.parseDouble(commissionstring);
	    	int experience=Integer.parseInt(line[7]);
	    	employees.add(new Employee(id,empname,designation,managerid,joining,salary,commission,experience));
	    	
	    }
		filestream.close();
		return employees;
	}
    public void display(List<Employee> employees)
    {
    	for(Employee employee:employees)
    	System.out.println(employee);
    }
    
    public void displayEmployeeWithHighestSalaries(List<Employee> employees)
    {
    	employees.stream().sorted((employee1,employee2)->(int)Math.ceil(employee2.getSalary()-employee1.getSalary())).limit(3).forEach(employee->System.out.println(employee));
    }
    public double calculateTotalPayment(List<Employee> employees)
    {
    	
    	return employees.stream().map(employee->employee.getSalary()+employee.getCommission()).reduce(0.0,(total1,total2)->total1+total2);
    }
    public void findEmployeesJoinedBetween(List<Employee> employees,Date startdate,Date enddate)
    {
    	Date joiningdate;
    	for(Employee employee:employees)
    	{
    		joiningdate=employee.getJoiningdate();
    		
    		if(joiningdate.compareTo(startdate)>=0 && joiningdate.compareTo(enddate)<=0)
    		      System.out.println(employee);
    	}
    }
    public void dislayEmployeeDepartally(List<Employee> employees)
    {
    	Map<Integer, List<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDeptno));
        Set<Map.Entry<Integer, List<Employee>>> employeeset=collect1.entrySet();
    	for(Map.Entry<Integer, List<Employee>> entry:employeeset)
    	{
    		System.out.println("Department No:"+entry.getKey());
    		for(Employee employee:entry.getValue())
    		{
    			System.out.println(employee);
    		}
    		
    	}
    }
}

