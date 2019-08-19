package poc.cleanarchitecture.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poc.cleanarchitecture.greeting.core.entities.Greeting;
import poc.cleanarchitecture.greeting.core.entities.GreetingStyle;
import poc.cleanarchitecture.greeting.core.usecases.GetGreeting;
import poc.cleanarchitecture.weather.core.entities.Location;
import poc.cleanarchitecture.weather.core.entities.WeatherReport;
import poc.cleanarchitecture.weather.core.usecases.GetWeatherReport;

import java.time.LocalDate;

@RestController
@RequestMapping("/news")
public class StartOfDayNews {

    private final GetGreeting getGreeting;
    private final GetWeatherReport getWeatherReport;

    @Autowired
    public StartOfDayNews(GetGreeting getGreeting, GetWeatherReport getWeatherReport) {

        this.getGreeting = getGreeting;
        this.getWeatherReport = getWeatherReport;
    }

    @GetMapping
    @ResponseBody
    public StartOfDayReport startTheDay(@RequestParam(required = false) GreetingStyle style, @RequestParam Double longitude, @RequestParam Double latitude) {
        Greeting greeting = getGreeting.sayHello(style);
        WeatherReport weatherReport = getWeatherReport.reportFor(new Location(latitude, longitude), LocalDate.now());
        return new StartOfDayReport(greeting.greet(), weatherReport.report());
    }

    public class StartOfDayReport {

        private String greeting;
        private String weatherReport;

        public StartOfDayReport(String greeting, String weatherReport) {
            this.greeting = greeting;
            this.weatherReport = weatherReport;
        }


    }
}


