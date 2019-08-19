package poc.cleanarchitecture.weather.core.entities;

import poc.cleanarchitecture.weather.core.usecases.InvalidLocationException;

public class Location {
    private final Double latitude;
    private final Double longitude;

    public Location(Double latitude, Double longitude) {
        if (latitude == null) throw new InvalidLocationException("Latitude must be set.");
        if (longitude == null) throw new InvalidLocationException("Longitude must be set.");
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double latitude() { return latitude; }
    public Double longitude() { return longitude; }

    public String toString() {
        return String.format("%f, %f", latitude, longitude);
    }
}
