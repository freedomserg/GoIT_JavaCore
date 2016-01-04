package com.goit.syrotskiy.module6.exceptionsMod;

public class Runner {

    public static void main(String[] args) {
        try
        {
            Driver driver = new Driver();
            //driver.setFastened(true);
            Car car = new Car();
            car.setDriver(driver);
            //car.setFuel(Fuel.Petrol);
            car.move();
        } catch (CarException ex) {
            processCarExceptions(ex);
        }
    }

    public static void processCarExceptions(CarException ex) {
        switch(ex.getErrorCode()) {
            case "THE_DRIVER_IS_NOT_FASTENED_EXCEPTION":
                System.out.println("[Error]: first fasten your seat belt, then you can go!");
                throw new DriverIsNotFastenedRuntimeException();
            case "THE_CAR_IS_FUELED_NOT_WITH_PETROL_EXCEPTION":
                System.out.println("[Error]: the car can't drive, first fuel it with petrol!");
                throw new CarFueledNotWithPetrolRuntimeException();
             default:
                 System.out.println("[Error]: Unknown exception raised. " + ex.getMessage());
                 ex.printStackTrace();
        }
    }

}
