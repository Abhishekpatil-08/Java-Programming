package com.CollageEvent;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	    /*Person p=new Student("rahul","sharma",2020,"IT",50000.00,93);
	    if(p instanceof Faculty) {
	    	((Faculty)p).Teach();//classCastException aayega isliye usko handel karna padega using instanceof 
	    }
	    else {
	    	System.out.println("not a Student");
	    }*/
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the capacity");
	    Person[] p=new Person[sc.nextInt()];
	    boolean exit=false;
	    int counter=0;
	    while(!exit) {
	    	System.out.println("1. Registar student "+"2. Register Faculty"+"3. Display Paricipants Details "+"4. Invoke Either Study/Teach"+"5. Exit");
	    System.out.println("enter choice:");
	    switch(sc.nextInt()) {
	    case 1://forStudent
	    	if(counter<p.length) {
	    		System.out.println("Seat is Available");
	    		System.out.println("Enter the Datails of Student like firstName ,LastName,GradYear ,course ,Fees ,Marks");
	    		p[counter++]=new Student(sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt());
	    	}
	    	else {
	    		System.out.println("Event if Full");
	    	}
	    	break;
	    case 2://forFaculty
	    	if(counter<p.length) {
	    		System.out.println("Seat is Available");
	    		System.out.println("Enter the Datails of Faculty like firstName ,LastName ,Exparience ,sme");
	    		p[counter++]=new Faculty(sc.next(),sc.next(),sc.nextInt(),sc.next());
	    	}
	    	else {
	    		System.out.println("Event if Full");
	    	}
	    	break;
	    case 3://DeatilsPrint
	    	for(Person p1:p) {
	    		if(p1!=null) {
	    			System.out.println(p1);
	    		}
	    	}
	    	
	    	break;
	    case 4:
	    	System.out.println("Enter seat numneb:");
	    	int index=sc.nextInt()-1;
	    	
	    	if(index>=0 && index<counter) {
	    	Person p1=p[index];
	    	if(p1!=null) {
	    		if(p1 instanceof Faculty) {
	    		((Faculty)p1).Teach(); 
	    	    }
	    		if(p1 instanceof Student) { 
		    		((Student)p1).study(); 
		    	    }
	    	}
	    	}
	    	else {
	    		System.out.println("NOt a Valid seat numneb:");
	    	}
	    	break;
	    case 5: exit=true;	
	    }
	    }
	}

}
