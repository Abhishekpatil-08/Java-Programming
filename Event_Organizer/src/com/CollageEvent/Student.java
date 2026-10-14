package com.CollageEvent;

public class Student extends Person {
	
	private int gradYear;
	private String course;
	private double fees;
	private int marks;
	
	public Student(String firstName, String lastName, int gradYear, String course, double fees, int marks) {
		super(firstName, lastName);
		this.gradYear = gradYear;
		this.course = course;
		this.fees = fees;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return super.toString() +"Student [gradYear=" + gradYear + ", course=" + course + ", fees=" + fees + ", marks=" + marks + "]";
	}
	
	public void study() {
		System.out.println(getFirstName()+" Is Studying in "+course);
	}
}
