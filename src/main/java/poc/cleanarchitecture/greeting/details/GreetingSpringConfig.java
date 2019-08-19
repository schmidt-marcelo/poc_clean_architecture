package poc.cleanarchitecture.greeting.details;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import poc.cleanarchitecture.greeting.core.usecases.GetGreeting;
import poc.cleanarchitecture.greeting.details.ports.GreetingInMemoryRepository;

@SpringBootConfiguration
public class GreetingSpringConfig {

    @Bean
    public GetGreeting getGreeting() {
        return new GetGreeting(new GreetingInMemoryRepository());
    }


}
