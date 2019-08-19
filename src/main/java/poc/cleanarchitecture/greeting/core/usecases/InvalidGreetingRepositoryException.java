package poc.cleanarchitecture.greeting.core.usecases;

public class InvalidGreetingRepositoryException extends RuntimeException {
    public InvalidGreetingRepositoryException(String message) {
        super(message);
    }
}
