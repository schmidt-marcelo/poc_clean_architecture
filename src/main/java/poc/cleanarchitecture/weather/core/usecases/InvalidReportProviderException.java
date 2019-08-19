package poc.cleanarchitecture.weather.core.usecases;

public class InvalidReportProviderException extends RuntimeException {
    public InvalidReportProviderException(String message) {
        super(message);
    }
}
