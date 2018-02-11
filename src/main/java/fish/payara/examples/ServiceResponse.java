package fish.payara.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mertcaliskan
 */
public class ServiceResponse {

    private long processingTime;
    private List<Forecast> forecasts = new ArrayList<>();

    public long getProcessingTime() {
        return processingTime;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setProcessingTime(long processingTime) {
        this.processingTime = processingTime;
    }

    public ServiceResponse forecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
        return this;
    }
}