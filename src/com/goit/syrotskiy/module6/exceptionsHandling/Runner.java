package com.goit.syrotskiy.module6.exceptionsHandling;

import com.goit.syrotskiy.module6.exceptionsHandlingMod.*;

public class Runner {

    public static void main(String[] args) {
        try
        {
            Driver driver = new Driver();
            //driver.setFastened(true);
            Car car = new Car();
            //car.setDriver(driver);
            //car.setFuel(Fuel.Diesel);
            car.move();
        } catch (CarRuntimeException ex) {
            processCarExceptions(ex);
        }
    }

    public static void processCarExceptions(CarRuntimeException ex) {
        if (ex instanceof DriverIsNotFastenedRuntimeException) {
            System.out.println("[Error]: first fasten your seat belt, then you can go!");
        } else if (ex instanceof CarFueledNotWithPetrolRuntimeException) {
            System.out.println("[Error]: the car can't drive, first fuel it with petrol!");
        } else {
            System.out.println("[Error]: Unknown exception raised. " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
