package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Race {

    private List<Vehicle> competitors = new ArrayList<Vehicle>();

    public List<Vehicle> getCompetitors() {
        return competitors;
    }

    public String readVehicleName(){
        System.out.println("Please type vehicle name and press Enter.");
        Scanner scanner = new Scanner(System.in);

        String vehicleName = scanner.nextLine();
        System.out.println("Your vehicle's name is " + vehicleName);
        return vehicleName;
    }

    public double readAccelerationSpeed() throws Exception {
        System.out.println("Please enter your acceleration speed as a decimal number and press Enter:");
        Scanner scanner = new Scanner(System.in);

        double accelerationSpeed = 0;
        try {
            accelerationSpeed = scanner.nextDouble();
            System.out.println("Your acceleration sppeed is: " + accelerationSpeed + " km/h");
        } catch (InputMismatchException exception) {
            System.out.println("Please Enter a valid number.");
            return readAccelerationSpeed();
        }

        return accelerationSpeed;
    }
}

