package com.techlabs.prototype;

public class Student implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	private int rno;

	public Student(int rno) {
		super();
		this.rno = rno;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + "]";
	}


	

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}
	

}
