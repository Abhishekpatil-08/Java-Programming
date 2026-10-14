package com.DateTime;

import java.util.Date;

public class Vehicle {

	private int Registrationnum;
	private String color;
	private double price;
	private Date ManufacturingDate;
	public Vehicle(int registrationnum, String color, double price, Date manufacturingDate) {
		super();
		Registrationnum = registrationnum;
		this.color = color;
		this.price = price;
		ManufacturingDate = manufacturingDate;
	}
	@Override
	public String toString() {
		return "Vehicle [Registrationnum=" + Registrationnum + ", color=" + color + ", price=" + price
				+ ", ManufacturingDate=" + ManufacturingDate + "]";
	}
    
	
}
