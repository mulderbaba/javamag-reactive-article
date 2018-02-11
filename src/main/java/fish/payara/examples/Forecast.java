package fish.payara.examples;

/**
 * @author mertcaliskan
 */
public class Forecast {

    private Location location;
    private Temperature temperature;

    public Forecast(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
    public Temperature getTemperature() {
        return temperature;
    }

    public Forecast setTemperature(
            final Temperature temperature) {
        this.temperature = temperature;
        return this;
    }
}