package com.CollageEvent;

public class Faculty extends Person{
	private int experiance;
	private String sme;
	public Faculty(String firstName, String lastName, int experiance, String sme) {
		super(firstName, lastName);
		this.experiance = experiance;
		this.sme = sme;
	}
	@Override
	public String toString() {
		return super.toString()  +"Faculty [experiance=" + experiance + ", sme=" + sme + "]";
	} 
	
	public void Teach() {
		System.out.println(getFirstName()+" Is teach in "+sme+" subject");
	}

}
