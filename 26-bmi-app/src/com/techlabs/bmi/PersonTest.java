package com.techlabs.bmi;

public class PersonTest {

	public static void main(String[] args) {
			
		Person person=new Person("Swapnil",1.64,56);
		double bmi=person.getBMI();
		System.out.println(person.getName());
		System.out.println("Your BMI:"+String.format("%.2f",person.getBMI()));
	    System.out.println("Your Body Category:"+person.getBodyCategory());
		

	}

}
