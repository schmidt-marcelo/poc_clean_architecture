package poc.cleanarchitecture.greeting.details.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poc.cleanarchitecture.greeting.core.entities.Greeting;
import poc.cleanarchitecture.greeting.core.entities.GreetingStyle;
import poc.cleanarchitecture.greeting.core.usecases.GetGreeting;

@RestController
@RequestMapping("/greeting")
public class GreetingRest {

    private GetGreeting getGreeting;

    @Autowired
    public GreetingRest(GetGreeting getGreeting) {

        this.getGreeting = getGreeting;
    }

    @GetMapping
    @ResponseBody
    public Greeting sayHello(@RequestParam(required = false) GreetingStyle style) {
        return getGreeting.sayHello(style);
    }
}
