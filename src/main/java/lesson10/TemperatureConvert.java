package lesson10;

public class TemperatureConvert implements Convertable {

    @Override
    public double toFarenheit(double celcius) {
        return ((double) (9 / 5) * (celcius + 32.0));
    }

    @Override
    public double toCelcius(double farenheit) {
        return ((double) 5 / 9 * (farenheit - 32.0));
    }
}

