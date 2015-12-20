package com.goit.Module4.Temperature;

public class RunConversionTemperature {
    public static void main(String[] args) {
        double fahrenheitTemperature = 213.0;
        double celsiusTemperature = ConversionTemperature.fahrenheitToCelsius(fahrenheitTemperature);
        System.out.printf("Temperature of %.1f degrees Fahrenheit equals %.1f degrees Celsius", fahrenheitTemperature, celsiusTemperature);
        System.out.println();

        celsiusTemperature = -13.0;
        fahrenheitTemperature = ConversionTemperature.celsiusToFahrenheit(celsiusTemperature);
        System.out.printf("Temperature of %.1f degrees Celsius equals %.1f degrees Fahrenheit", celsiusTemperature, fahrenheitTemperature);
    }
}
