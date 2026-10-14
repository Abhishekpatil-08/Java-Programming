package com.CompanyEvent;

public class Mgr extends Emp {
	private double performanceBonus;

	public Mgr(int id, String name, int deptId, double basicsalary, double performanceBonus) {
		super(id, name, deptId, basicsalary);
		this.performanceBonus = performanceBonus;
	}

	@Override
	public String toString() {
		return "Mgr "+ super.toString() + " [performanceBonus=" + performanceBonus + "]";
	}
	
	public double computeNetSalary() {
		return getBasicsalary()+performanceBonus;
	}
	public double getperformanceBonus() {
    	return performanceBonus;
    }

}
