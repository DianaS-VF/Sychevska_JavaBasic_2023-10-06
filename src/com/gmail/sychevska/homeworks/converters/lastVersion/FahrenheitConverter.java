package com.gmail.sychevska.homeworks.converters.lastVersion;

public class FahrenheitConverter extends TemperatureConverter {
    private static final double MULTIPLIER = 1.8;
    private static final double OFFSET = 32;

    public FahrenheitConverter() {
        super("℉");
    }

    @Override
    public double toCelsius(double temperature) {
        return (temperature - OFFSET) / MULTIPLIER;
    }

    @Override
    public double fromCelsius(double temperature) {
        return MULTIPLIER * temperature + OFFSET;
    }
}
