package com.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try(	Scanner sc=new Scanner(System.in)){
			SimpleDateFormat stf=new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Enter vehicle Detailes:");
			Vehicle v1=new Vehicle(sc.nextInt(),sc.next(),sc.nextDouble(),stf.parse(sc.next()));
			System.out.println(v1);
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		
		

	}

}

