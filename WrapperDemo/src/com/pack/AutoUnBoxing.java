package com.pack;

public class AutoUnBoxing {
	
	public static void main(String [] args) {
		int data=12345;
		Integer i=Integer.valueOf(data);// boxing done by compiler
		int data1=i.intValue();// unboxing done by compiler
		
		Integer i1=data;//AutoBoxing
		int data2=i;//AutoUnBoxing
		
	}

}
