package fish.payara.examples;

/**
 * @author mertcaliskan
 */
public class Location {

    String name;

    public Location() {}

    public Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}