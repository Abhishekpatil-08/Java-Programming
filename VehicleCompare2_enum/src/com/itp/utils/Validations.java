package com.itp.utils;
import com.itp.core_classes.Vehicle;
import userdefined_exception.VehicleHandlingException;
import static com.itp.core_classes.Vehicle.sdf;
import java.text.ParseException;

public class Validations {

    public static Vehicle checkForDups(
            Vehicle[] vdata,
            int regNo,
            String c,
            double price,
            String date)
            throws VehicleHandlingException, ParseException {

     
        Vehicle newVehicle =new Vehicle(regNo, c, price, sdf.parse(date));

        for (Vehicle v : vdata) {
          
            if (v != null) {
                if (v.equals(newVehicle)) {
                    throw new VehicleHandlingException("dup vehicle found");
                }
            }
        }
        return newVehicle;
    }
}