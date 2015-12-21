package com.goit.module4.temperature;

public class Runner {
    public static void main(String[] args) {
        double fahrenheitTemperature = 213.0;
        double celsiusTemperature = TemperatureConversionUtilities.fahrenheitToCelsius(fahrenheitTemperature);
        System.out.printf("temperature of %.1f degrees Fahrenheit equals %.1f degrees Celsius", fahrenheitTemperature, celsiusTemperature);
        System.out.println();

        celsiusTemperature = -13.0;
        fahrenheitTemperature = TemperatureConversionUtilities.celsiusToFahrenheit(celsiusTemperature);
        System.out.printf("temperature of %.1f degrees Celsius equals %.1f degrees Fahrenheit", celsiusTemperature, fahrenheitTemperature);
    }
}
