package entrypoint;
import java.text.ParseException;
import java.util.Scanner;
import com.itp.core_classes.Vehicle;
import userdefined_exception.VehicleHandlingException;
import static com.itp.utils.Validations.checkForDups;

public class VehicleShowroom {

    public static void main(String[] args) {

      
        try (Scanner sc = new Scanner(System.in)) {

            Vehicle[] vehicles = new Vehicle[100];

            boolean exit = false;
            int counter = 0;

            while (!exit) {

                System.out.println();
                System.out.println("1:Add new vehicle  "+ "2:Display Vehicle Info  "+ "3:Exit");
                System.out.println("choose your option");

                try {

                    switch (sc.nextInt()) {

                    case 1:

                        if (counter < vehicles.length) {
                            System.out.println("enter veh details " + "regno,color,price,manufacture date");
                            Vehicle newVehicle =checkForDups(vehicles,sc.nextInt(),sc.next(),sc.nextDouble(),sc.next());
                            vehicles[counter++] = newVehicle;
                            System.out.println("vehicle added succesfully");
                        }
                        else {
                            System.out.println("showroom is full");
                        }

                        break;

                    case 2:

                        System.out.println("display vehicles inside showroom");

                        for (Vehicle v1 : vehicles) {
                            if (v1 != null) {
                                System.out.println(v1);
                            }
                        }
                        break;

                    case 3: exit = true;

                        break;

                    default: System.out.println("Invalid option");
                    }

                }

                catch (VehicleHandlingException e) {
                    e.printStackTrace();
                }
                catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}