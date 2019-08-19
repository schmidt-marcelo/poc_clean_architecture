package poc.cleanarchitecture.greeting.details.ports;

import poc.cleanarchitecture.greeting.core.entities.Greeting;
import poc.cleanarchitecture.greeting.core.entities.GreetingStyle;
import poc.cleanarchitecture.greeting.core.usecases.repositories.GreedingRepository;

public class GreetingInMemoryRepository implements GreedingRepository {
    @Override
    public Greeting of(GreetingStyle style) {
        switch (style) {
            case AMERICAN:
                return new Greeting("Hey, hello!");

            case BRAZILIAN:
                return new Greeting("Olá, como vai?");

            case ESPANOL:
                return new Greeting("¡Hola! ¿Que tal? ");

            case GAUCHO:
            default:
                return new Greeting("Buenas, tchê!?");

        }

    }
}
