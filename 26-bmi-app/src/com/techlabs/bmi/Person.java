package com.techlabs.bmi;

public class Person {
	private String name;
	private double height;
	private double weight;
	private double bmi;

	Person() {
		this(null, 0, 0);
	}

	Person(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		bmi = calculateBMI();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double getHeight() {
		return height;
	}

	public void setWeight(double w) {
		weight = w;
	}

	public double getWeight() {
		return weight;
	}

	public double getBMI() {
		return bmi;
	}

	private double calculateBMI() {
		return weight / (height * height);
	}

	public String getBodyCategory() {
		String category = null;
		if (bmi < 18.5)
			category = "Underweight";
		if (bmi >= 18.5 && bmi <= 24.9)
			category = "Healthy Weight";
		if (bmi >= 25 && bmi <= 30)
			category = "Overweight";
		if (bmi > 30)
			category = "Obses Range";

		return category;
	}

}
