package com.CompanyTest;
import java.util.Scanner;

import com.CollageEvent.Student;
import com.CompanyEvent.Emp;
import com.CompanyEvent.Mgr;
import com.CompanyEvent.Wkr;
public class CompanyTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Capacity");
		Emp[] e=new Emp[sc.nextInt()];
		
		boolean exit=false;
		int counter=0;
		while(!exit) {
	    	System.out.println("1. Registar Manager "+"2. Register Worker"+"3. Display Paricipants Details "+"4. Invoke Either Bonus/HourlyRatenvoke Either /Teach"+"5. Exit");
		    System.out.println("Enter choice: ");
		switch(sc.nextInt()) {
		case 1:
			if(counter<e.length) {
				System.out.println("Seat is Available");
	    		System.out.println("Enter the Datails of Manager like id , Name, deptId , BasicSalry, performanceBonus");
	    		e[counter++]=new Mgr(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble());
			}
			else {
				System.out.println("Seats is Full");
			}
			break;
		case 2:
			if(counter<e.length) {
				System.out.println("Seat is Available");
	    		System.out.println("Enter the Datails of Worker like id , Name, deptId , BasicSalry, hoursWorked,hourlyRate");
	    		e[counter++]=new Wkr(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt(),sc.nextDouble());
			}
			else {
				System.out.println("Seats is Full");
			}
			break;
		case 3:
			for(Emp e1:e) {
				if(e1!=null) {
				System.out.println(e1);
			    }
			}
			break;
		case 4:
			System.out.println("Enter Seatnumber:");
			int index=sc.nextInt()-1;
			if(index>=0&& index<counter){
				Emp e1=e[index];
				if(e1!=null) {
				if(e1 instanceof Mgr) {

					System.out.println(((Mgr)e1).getperformanceBonus());
				}
				if(e1 instanceof Wkr) {
					System.out.println(((Wkr)e1).gethrlyRate());
					
				}
				}
			}
			else {
	    		System.out.println("NOt a Valid seat numneb:");
	    	}
			break;
		case 5:
			exit=true;
			break;
		}
	    }

}
}