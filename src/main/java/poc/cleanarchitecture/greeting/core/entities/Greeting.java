package poc.cleanarchitecture.greeting.core.entities;

public class Greeting {

    private final String greeting;

    public Greeting(String greeting) {
        if (null == greeting || greeting.isBlank()) throw new InvalidGreetingException(String.format("%s is not a valid greeting."));
        this.greeting = greeting;
    }

    public String greet() {
        return this.greeting;
    }

}
