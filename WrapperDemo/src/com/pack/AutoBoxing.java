package com.pack;

public class AutoBoxing {
	public static void main(String [] args) {
		int data=12345;
		Integer i=Integer.valueOf(data);// boxing done by compiler before jdk 1.5
		
		Integer i1=data;//AutoBoxing automatically by compiler before
		
		
	}
}
