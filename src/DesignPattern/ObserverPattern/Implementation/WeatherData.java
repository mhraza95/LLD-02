package DesignPattern.ObserverPattern.Implementation;

import DesignPattern.ObserverPattern.Behaviour.Observer;
import DesignPattern.ObserverPattern.Behaviour.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {

        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        for (Observer observers: observers) {

            observers.update(temperature, pressure, humidity);
        }
    }

    public void measurementChanged() {

        notifyObservers();
    }

    public void setMeasurementChanged(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged();
    }
}
