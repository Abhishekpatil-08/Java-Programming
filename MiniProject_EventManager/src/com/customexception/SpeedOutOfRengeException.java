package com.customexception;

public class SpeedOutOfRengeException extends Exception {

    public SpeedOutOfRengeException() {
        super("Speed is out of allowed range! Speed must be between 40 and 80 km/h.");
    }
}