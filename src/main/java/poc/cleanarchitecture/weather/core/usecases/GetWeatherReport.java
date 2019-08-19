package poc.cleanarchitecture.weather.core.usecases;

import poc.cleanarchitecture.weather.core.entities.Location;
import poc.cleanarchitecture.weather.core.entities.WeatherReport;
import poc.cleanarchitecture.weather.core.usecases.port.WeatherReportProvider;

import java.time.LocalDate;

public class GetWeatherReport {

    private WeatherReportProvider provider;

    public GetWeatherReport(WeatherReportProvider provider) {
        if (provider == null) throw new InvalidReportProviderException("Report provider must be provided.");
        this.provider = provider;
    }

    public WeatherReport reportFor(Location location, LocalDate date) {
        if (location == null) throw new InvalidLocationException("Location must be provided.");
        if (date == null) date = LocalDate.now();
        return provider.reportFor(location, date);
    }


}
