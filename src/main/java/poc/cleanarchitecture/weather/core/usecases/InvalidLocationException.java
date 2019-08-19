package poc.cleanarchitecture.weather.core.usecases;

public class InvalidLocationException extends RuntimeException {
    public InvalidLocationException(String message) {
        super(message);
    }
}
