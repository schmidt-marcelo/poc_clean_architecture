package poc.cleanarchitecture.weather.core.usecases.port;

import poc.cleanarchitecture.weather.core.entities.Location;
import poc.cleanarchitecture.weather.core.entities.WeatherReport;

import java.time.LocalDate;


public interface WeatherReportProvider {

    WeatherReport reportFor(Location location, LocalDate date);
}
