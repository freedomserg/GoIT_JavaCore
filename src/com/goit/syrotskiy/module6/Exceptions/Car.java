package com.goit.syrotskiy.module6.Exceptions;

public class Car {
    private Driver driver;
    private Fuel fuel;
    private Engine engine;
    private boolean move;


    public Car(Driver driver, Fuel fuel) throws CarFueledNotWithPetrolException, DriverIsNotFastenedException {
        if ((driver == null) | (fuel == null)) {
            throw new NullPointerException();
        }
        this.driver = driver;
        this.fuel = fuel;
        this.engine = new Engine();

        if (fuel != Fuel.Petrol) {
            throw new CarFueledNotWithPetrolException();
        }
        engine.setStartEngine(true);

        if (!driver.isFastened()) {
            throw new DriverIsNotFastenedException();
        }
        this.move = true;
    }
}
