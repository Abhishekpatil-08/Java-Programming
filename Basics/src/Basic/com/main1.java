package Basic.com;

import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

public class main1 {
	public static void main(String[] args) {
		Withdrow w=new Withdrow(10000.00);
		try {
			w.withdrow(1000.00);
		}
		catch(InsufficientResourcesException e) {
			System.out.println("Insufficient Balance");
		}
	}

}
