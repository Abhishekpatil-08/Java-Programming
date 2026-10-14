package com.pack;

public class WrapperDemo3 {
public static void main(String []args) {
	Double d1=123.45;
	double data=d1;
	
	int x=10;
	data=x;
	System.out.println(data);
	
	
	//Double d3=12;// error
	Double d2=(double)12;
	 // type casting int can be converted into double datatype 
	// autoboxing => convert double type of value into double 
	
	//Double d5=12.345f; error
	
	Double d4=(double)12.345f;
	//float => double (typecasting/widening);
	
	Number n1=1;
	//1(int) +> Integer type pf wrapper (Autoboxing)
	// check whether integer is a subclass of number yes 
	//upcasting
	
	n1=1.0;//auto boxing (double=> Double)=>
	n1=1.0f;
	//n1=true;
	//n1='A';
	//n1="Hello";
	
	Object o1=1;
	o1=1.0f;
	o1="hello";
	o1=true;
	o1='A';
	// Object referse can points to primitive type/referancetype
}

}
