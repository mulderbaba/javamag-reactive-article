package fish.payara.examples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Random;

/**
 * @author mertcaliskan
 */
@Path("/temperature")
public class TemperatureResource {

    @GET
    @Path("/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAverageTemperature(@PathParam("city") String cityName) {

        Temperature temperature = new Temperature();
        temperature.setTemperature((double) (new Random().nextInt(20)+30));
        temperature.setScale("Celsius");

        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {}

        return Response.ok(temperature).build();
    }
}