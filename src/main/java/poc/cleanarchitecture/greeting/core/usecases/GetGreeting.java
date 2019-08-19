package poc.cleanarchitecture.greeting.core.usecases;

import poc.cleanarchitecture.greeting.core.entities.Greeting;
import poc.cleanarchitecture.greeting.core.entities.GreetingStyle;
import poc.cleanarchitecture.greeting.core.usecases.repositories.GreedingRepository;

public class GetGreeting {

    private GreedingRepository greetings;

    public GetGreeting(GreedingRepository greetings) {
        if (greetings == null) throw new InvalidGreetingRepositoryException("Greetings must be provided.");
        this.greetings = greetings;
    }

    public Greeting sayHello(GreetingStyle style) {
        if (style == null) style = GreetingStyle.GAUCHO;
        return this.greetings.of(style);
    }
}
