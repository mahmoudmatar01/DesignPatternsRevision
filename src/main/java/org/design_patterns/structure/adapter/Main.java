package org.design_patterns.structure.adapter;

public class Main {
    public static void main(String[]args){

        LegacyWeatherService legacyWeatherService = new LegacyWeatherService();
        String temperatureXmlData = legacyWeatherService.getWeatherDataForCityAndCountry("Cairo","Egypt");
        System.out.println(temperatureXmlData);

        System.out.println("------------------------------------------------------------");

        WeatherServiceAdapter weatherServiceAdapter = new WeatherServiceAdaptee();
        TemperatureData temperatureData = weatherServiceAdapter.getWeatherDataForLangAndLate(1234,5678);
        System.out.println(temperatureData.temperatureData());

    }
}
