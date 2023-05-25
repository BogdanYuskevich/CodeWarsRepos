package EasyLvlKatas;

public class TemperatureConv {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        double[] temperatureConverted = {kelvin,fahrenheit};
        return temperatureConverted;
    }
}
