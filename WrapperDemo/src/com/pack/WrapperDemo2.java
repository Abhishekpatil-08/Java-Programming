package com.pack;

public class WrapperDemo2 {
   public static void main(String []args) {
	   String s="helloo";
	   //s++;
	   
	   Integer i=12345;
	   i++;
	   //1.AutoUnBoxing 2. Increment 3. AutoBoxing 
	   System.out.println(i);
	   
	   Double d=123.25; // AutoBoxing
	   double data=d;// AutoUnBoxing
	   System.out.println(data);
	   
	   
   }
}
