package com.goit.syrotskiy.module4.temperature;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureConversionUtilitiesTest {

    @Test(timeout = 1000)
    public void testCelsiusToFahrenheit() throws Exception {
        int celsiusTemperature = 100;
        Assert.assertEquals(celsiusTemperature * 9 / 5 + 32, TemperatureConversionUtilities.celsiusToFahrenheit(celsiusTemperature), 1);
    }

    @Test(timeout = 1000)
    public void testFahrenheitToCelsius() throws Exception {
        int fahrenheitTemperature = 100;
        Assert.assertEquals((fahrenheitTemperature - 32) * 5 / 9,
                TemperatureConversionUtilities.fahrenheitToCelsius(fahrenheitTemperature), 1);
    }
}