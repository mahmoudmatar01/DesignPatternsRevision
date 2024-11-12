package org.design_patterns.structure.adapter;

public interface WeatherServiceAdapter {
    TemperatureData getWeatherDataForLangAndLate(long lat,long lang);
}
