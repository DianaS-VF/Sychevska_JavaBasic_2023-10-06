package com.gmail.sychevska.homeworks.converters.lastVersion;

public class KelvinConverter extends TemperatureConverter {
    private static final double ZERO_CELSIUS_IN_KELVIN = 273.15;

    public KelvinConverter() {
        super("K");
    }

    @Override
    public double toCelsius(double temperature) {
        return temperature - ZERO_CELSIUS_IN_KELVIN;
    }

    @Override
    public double fromCelsius(double temperature) {
        return temperature + ZERO_CELSIUS_IN_KELVIN;
    }
}
