package com.goit.syrotskiy.module6.Exceptions;

public class Runner {

    public static void main(String[] args) {
        try
        {
            new Car(new Driver(true), Fuel.Kerosene);
        } catch (NullPointerException e) {
            System.out.println("[Error]: A car can't go without driver or fuel!");
        } catch (CarFueledNotWithPetrolException ex) {
            System.out.println("[Error]: Your car is fueled not with petrol!");
        } catch (DriverIsNotFastenedException exc) {
            System.out.println("[Error]; Driver is not fastened!");
        }
    }

}
