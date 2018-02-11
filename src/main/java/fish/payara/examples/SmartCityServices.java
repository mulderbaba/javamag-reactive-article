package fish.payara.examples;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author mertcaliskan
 */
@ApplicationPath("/smartcity")
public class SmartCityServices extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();

        classes.add(LocationResource.class);
        classes.add(TemperatureResource.class);
        classes.add(ForecastResource.class);
        classes.add(ForecastReactiveResource.class);

        return classes;
    }

}