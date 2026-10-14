package Basic.com;

import javax.naming.InsufficientResourcesException;

public class Withdrow {
	private double balance;
	
	public Withdrow(double balance) {
		this.balance=balance;
	}
	void withdrow(double amount) throws InsufficientResourcesException{
		if(amount>balance) {
			throw new InsufficientResourcesException();
		}
		else {
			System.out.println("Withdrow successfully");
		}
	}

}
