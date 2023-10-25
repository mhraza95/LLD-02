package DesignPattern.ObserverPattern;

import DesignPattern.ObserverPattern.Implementation.CurrentConditionsDisplay;
import DesignPattern.ObserverPattern.Implementation.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurementChanged(80, 65, 30.4f);
        weatherData.setMeasurementChanged(85, 70, 32.6f);
    }
}
