package com.utils;

import com.customexception.SpeedOutOfRengeException;

public class SpeedValidationRules {

    private static final int MIN_SPEED;
    private static final int MAX_SPEED;

    static {
        MIN_SPEED = 40;
        MAX_SPEED = 80;
    }

    public static void validateSpeed(int speed)
            throws SpeedOutOfRengeException {

        if (speed < MIN_SPEED) {
            throw new SpeedOutOfRengeException();
        }

        if (speed > MAX_SPEED) {
            throw new SpeedOutOfRengeException();
        }

        System.out.println("Speed is OK");
    }
}