package poc.cleanarchitecture.weather.details.ports;

import poc.cleanarchitecture.weather.core.entities.Location;
import poc.cleanarchitecture.weather.core.entities.WeatherReport;
import poc.cleanarchitecture.weather.core.usecases.port.WeatherReportProvider;

import java.time.LocalDate;
import java.time.Period;

public class InMemoryWeatherReportProvider implements WeatherReportProvider {
    @Override
    public WeatherReport reportFor(Location location, LocalDate date) {
        if (date == null) date = LocalDate.now();
        LocalDate today = LocalDate.now();
        if (dateBeforeToday(date, today)) throw new WeatherReportNotFoundException("I can provide reports for the past.");

        Period period = Period.between(date, today);
        int daysAhead = period.getDays();

        String[] weather = {"sunny", "cloudy", "rainny"};
        int weatherSkyIndex = 1 + (int) Math.random() * 3;

        String daysWeather = (daysAhead == 0? "today": String.format("%d days", daysAhead));

        return new WeatherReport(String.format("The weather for the location %s for %s is %s", location, daysWeather, weather[weatherSkyIndex]));
    }

    private boolean dateBeforeToday(LocalDate date, LocalDate today) {
        return date.atStartOfDay().isBefore(today.atStartOfDay());
    }
}
