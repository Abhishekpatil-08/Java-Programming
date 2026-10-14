package com.itp.core_classes;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {

    
    private int registrationNo;
    private String color;
    private double price;
    private Date manufactureDate;

    public static SimpleDateFormat sdf;

    static {
        sdf = new SimpleDateFormat("dd-MM-yyyy");
    }

    public Vehicle(int registrationNo, String color,double price, Date manufactureDate) {

        this.registrationNo = registrationNo;
        this.color = color;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    public boolean equals(Object obj) {

        System.out.println("in equals method");

        if (this == obj) {
            return true;
        }

        if (obj instanceof Vehicle) {

            Vehicle v = (Vehicle) obj;

            return this.registrationNo == v.registrationNo && this.color.equals(v.color);
        }

        return false;
    }

    public String toString() {

        return "Vehicle [registrationNo=" + registrationNo+ ", color=" + color + ", price=" + price + ", manufactureDate=" + sdf.format(manufactureDate)+ "]";
    }
}