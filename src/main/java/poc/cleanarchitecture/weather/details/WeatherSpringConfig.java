package poc.cleanarchitecture.weather.details;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import poc.cleanarchitecture.weather.core.usecases.GetWeatherReport;
import poc.cleanarchitecture.weather.details.ports.InMemoryWeatherReportProvider;

@SpringBootConfiguration
public class WeatherSpringConfig {

    @Bean
    public GetWeatherReport getWeatherReport() {
        return new GetWeatherReport(new InMemoryWeatherReportProvider());
    }
}
