package com.goit.syrotskiy.module4.temperature;

public class TemperatureConversionUtilities {

    public static double celsiusToFahrenheit(double celsiusTemperature) {
        return celsiusTemperature * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) * 5 / 9;
    }
}
