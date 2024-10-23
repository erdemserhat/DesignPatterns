package strategy_observer;

import java.util.ArrayList;

public class WeatherStation {
    private ArrayList<WeatherObserver> observers = new ArrayList<WeatherObserver>();
    private Double temperature =0.0;

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);

    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);

    }

    private void notifyObservers() {
        for(WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(double temperature) {
        this.temperature=temperature;
        notifyObservers();
    }


}
