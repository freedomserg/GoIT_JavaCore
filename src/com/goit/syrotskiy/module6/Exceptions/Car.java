package com.goit.syrotskiy.module6.Exceptions;

public class Car {
    private Driver driver;
    private Fuel fuel;
    private Engine engine = new Engine();

    public Car() {
    }

    public Car(Driver driver) {
        this.driver = driver;
    }

    public Car(Fuel fuel) {
        this.fuel = fuel;
    }

    public Car(Driver driver, Fuel fuel) {
        this.driver = driver;
        this.fuel = fuel;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void move() throws CarException {
        try {
            if (driver == null) throw new IllegalArgumentException("[Error]: driver is null!");
            if (!driver.isFastened()) throw new DriverIsNotFastenedException();

            if (fuel == null) throw new IllegalArgumentException("[Error]: fuel is null!");
            if (fuel != Fuel.Petrol) throw new CarFueledNotWithPetrolException();

            engine.setStartEngine();
            System.out.println("The car started driving!");
        } catch (DriverIsNotFastenedException ex) {
            throw new DriverIsNotFastenedException(ex.getMessage(), "THE_DRIVER_IS_NOT_FASTENED_EXCEPTION");
        } catch (CarFueledNotWithPetrolException exc) {
            throw new CarFueledNotWithPetrolException(exc.getMessage(), "THE_CAR_IS_FUELED_NOT_WITH_PETROL_EXCEPTION");
        }
    }
}
