package org.design_patterns.structure.adapter;

public class LegacyWeatherService {

    private final ThirdPartyWeatherService thirdPartyWeatherService;

    public LegacyWeatherService() {
        this.thirdPartyWeatherService = new ThirdPartyWeatherService();
    }

    public String getWeatherDataForCityAndCountry(String city, String country) {
        return thirdPartyWeatherService.getWeatherData(city, country);
    }
}
