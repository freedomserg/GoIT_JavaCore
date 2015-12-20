package com.goit.Module4.Temperature;

public class RunConversion {
    public static void main(String[] args) {
        double fahrenheitTemperature = 212;
        double celsiusTemperature = ConversionTemperature.fahrenheitToCelsius(fahrenheitTemperature);
        System.out.println("Temperature of " + fahrenheitTemperature +
                " degrees Fahrenheit equals " + celsiusTemperature +
                " degrees Celsius");

        celsiusTemperature = -10;
        fahrenheitTemperature = ConversionTemperature.celsiusToFahrenheit(celsiusTemperature);
        System.out.println("Temperature of " + celsiusTemperature +
                " degrees Celsius equals " + fahrenheitTemperature +
                " degrees Fahrenheit");
    }
}
