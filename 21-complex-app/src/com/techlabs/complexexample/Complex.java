package com.techlabs.complexexample;

public class Complex {
	private double real;
	private double img;

	Complex() {
		real = 0;
		img = 0;
	}

	Complex(double real, double img) {
		this.real = real;
		this.img = img;
	}

	void setReal(double r) {
		real = r;
	}

	double getReal() {
		return real;
	}

	void setImg(double i) {
		img = i;
	}

	double getImg() {
		return img;
	}

	Complex addComplex(Complex c2) {
		Complex c3 = new Complex();
		c3.real = this.real + c2.real;
		c3.img = this.img + c2.img;
		return c3;
	}
}
