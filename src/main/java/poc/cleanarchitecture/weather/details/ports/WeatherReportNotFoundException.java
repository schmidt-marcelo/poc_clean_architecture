package poc.cleanarchitecture.weather.details.ports;

public class WeatherReportNotFoundException extends RuntimeException {
    public WeatherReportNotFoundException(String message) {
        super(message);
    }
}
