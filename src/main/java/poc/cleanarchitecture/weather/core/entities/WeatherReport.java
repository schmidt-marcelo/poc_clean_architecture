package poc.cleanarchitecture.weather.core.entities;

public class WeatherReport {

    private final String report;

    public WeatherReport(String report) {
        if (null == report || report.isBlank()) throw new InvalidReportException(String.format("%s is not a valid wether report."));
        this.report = report;
    }

    public String report() {
        return this.report;
    }
}
