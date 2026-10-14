package com.tester;

import java.util.Scanner;

import com.customexception.SpeedOutOfRengeException;
import com.utils.SpeedValidationRules;

public class SpeedTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle speed: ");

        int speed = sc.nextInt();

        try {

            SpeedValidationRules.validateSpeed(speed);

        } catch (SpeedOutOfRengeException e) {

            System.out.println(e.getMessage());
        }

        System.out.println("Program Ends");

        sc.close();
    }
}