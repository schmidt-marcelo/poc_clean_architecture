package poc.cleanarchitecture.greeting.core.entities;

public class InvalidGreetingException extends RuntimeException {
    public InvalidGreetingException(String message) {
        super(message);
    }
}
