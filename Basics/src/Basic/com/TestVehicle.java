package Basic.com;

import java.util.Scanner;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);

    	        System.out.println("Enter Vehicle 1 details:");

    	        System.out.print("Registration No: ");
    	        int regNo1 = sc.nextInt();

    	        System.out.print("Color: ");
    	        String color1 = sc.next();

    	        System.out.print("Price: ");
    	        double price1 = sc.nextDouble();

    	        vehicle v1 = new vehicle(regNo1, color1, price1);


    	        System.out.println("\nEnter Vehicle 2 details:");

    	        System.out.print("Registration No: ");
    	        int regNo2 = sc.nextInt();

    	        System.out.print("Color: ");
    	        String color2 = sc.next();

    	        System.out.print("Price: ");
    	        double price2 = sc.nextDouble();

    	        vehicle v2 = new vehicle(regNo2, color2, price2);
    	        
    	        if (v1.getRegistrationNo() == v2.getRegistrationNo()) {
    	            System.out.println("SAME");
    	        } else {
    	            System.out.println("DIFFERENT");
    	        }

    	        sc.close();
               }
}

