package com.CompanyEvent;

public class Wkr extends Emp {
	private int hoursWorked;
	private double hourlyRate;
	public Wkr(int id, String name, int deptId, double basicsalary, int hoursWorked, double hourlyRate) {
		super(id, name, deptId, basicsalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	@Override
	public String toString() {
		return "Wkr "+super.toString() + "Wkr [hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + "]";
	}
	
	public double computeNetSalary() {
		return getBasicsalary()+(hoursWorked*hourlyRate);
	}
    public double gethrlyRate() {
    	return hourlyRate;
    }
    
    	
}
