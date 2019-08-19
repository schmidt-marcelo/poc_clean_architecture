package poc.cleanarchitecture.greeting.core.usecases.repositories;

import poc.cleanarchitecture.greeting.core.entities.Greeting;
import poc.cleanarchitecture.greeting.core.entities.GreetingStyle;

public interface GreedingRepository {

    Greeting of(GreetingStyle style);
}
