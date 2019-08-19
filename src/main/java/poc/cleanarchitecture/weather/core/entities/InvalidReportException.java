package poc.cleanarchitecture.weather.core.entities;

public class InvalidReportException extends RuntimeException {
    public InvalidReportException(String message) {
        super(message);
    }
}
