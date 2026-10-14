package Basic.com;

public class vehicle {
 
	private int registrationNo;
	private String color;
	private double price;
	
	 public vehicle(int registrationNo, String color, double price) {
	        this.registrationNo = registrationNo;
	        this.color = color;
	        this.price = price;
	    }
	 
	 public int getRegistrationNo() {
		 return registrationNo;
	 }
	 
	 public String getColor() {
		 return color;
	 }
	 public double getPrice() {
		 return price;
	 }
	 
	 public String toString() {
	        return "Vehicle [registrationNo of the vehicle :" + registrationNo
	                + ", color of the vehicle :" + color
	                + ", price of the vehicle :" + price + "]";
	    }

}
