package Module4.Temperature;

public class ConversionTemperature {

    public static double celsiusToFahrenheit(double celsiusTemperature) {
        return celsiusTemperature * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) * 5 / 9;
    }
}
