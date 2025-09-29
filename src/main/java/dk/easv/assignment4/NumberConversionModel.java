package dk.easv.assignment4;

public class NumberConversionModel {
    private static final double MILES_TO_KM = 1.609344;

    public String getGreetingsMessage(String name) {
        return "Hello, " + name + ". Greetings from the top Java developer class in town";
    }

    public double getMilesFromKilometers(double km) {
        return km / MILES_TO_KM;
    }

    public double getKilometersFromMiles(double miles) {
        return miles * MILES_TO_KM;
    }
}
