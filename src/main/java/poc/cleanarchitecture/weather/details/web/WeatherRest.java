package poc.cleanarchitecture.weather.details.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poc.cleanarchitecture.weather.core.entities.Location;
import poc.cleanarchitecture.weather.core.entities.WeatherReport;
import poc.cleanarchitecture.weather.core.usecases.GetWeatherReport;

import java.time.LocalDate;

@RestController
@RequestMapping("/weather")
public class WeatherRest {

    private GetWeatherReport getWeatherReport;

    @Autowired
    public WeatherRest(GetWeatherReport getWeatherReport) {

        this.getWeatherReport = getWeatherReport;
    }

    @GetMapping
    @ResponseBody
    public WeatherReport weatherForToday(@RequestParam("latitude") Double latitude, @RequestParam("longitude") Double longitude) {

        return getWeatherReport.reportFor(new Location(latitude, longitude), LocalDate.now());
    }
}
