package DesignPattern.ObserverPattern.Implementation;

import DesignPattern.ObserverPattern.Behaviour.DisplayElement;
import DesignPattern.ObserverPattern.Behaviour.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {

        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {

        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {

        System.out.println("Current Conditions " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
