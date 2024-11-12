package org.design_patterns.structure.adapter;

public class WeatherServiceAdaptee implements WeatherServiceAdapter{

    private final LegacyWeatherService legacyWeatherService;

    public WeatherServiceAdaptee() {
        this.legacyWeatherService = new LegacyWeatherService();
    }

    @Override
    public TemperatureData getWeatherDataForLangAndLate(long lat, long lang) {
        String city = gettingCityForLangAndLate(lat, lang);
        String country = gettingCountryForLangAndLate(lang, lat);
        String weatherXmlData = legacyWeatherService.getWeatherDataForCityAndCountry(city, country);
        return convertXmlWeatherDataToJsonData(weatherXmlData);
    }

    private TemperatureData convertXmlWeatherDataToJsonData(String xmlWeatherData){
        System.out.println("Converting xml weather data to JSON");
        return new TemperatureData(xmlWeatherData);
    }

    private String gettingCityForLangAndLate(long lang,long lat){
        System.out.println("fetching the city for lang " + lang + " and late " + lat );
        return "Tanta";
    }

    private String gettingCountryForLangAndLate(long lang,long lat){
        System.out.println("fetching the country for lang " + lang + " and late " + lat );
        return "Egypt";
    }
}
