package org.design_patterns.structure.adapter;

public class ThirdPartyWeatherService {

    public String getWeatherData(String city,String country){
        return "fetching weather data for city "+city+" and country "+country;
    }
}
