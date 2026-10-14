package com.DateTime;

import java.util.Date;

public class Wrapper1 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);
		Date d2=new Date(10);
		System.out.println(d2);
		System.out.println(d2.before(d1));
		System.out.println(d2.compareTo(d1));
		
		
	}

}
