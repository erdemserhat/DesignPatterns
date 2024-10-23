package strategy_observer;

public class WindowsDisplay  implements  WeatherObserver{
    private Double temperatureValue=0.0;
    @Override
    public void update(Double temperature) {
        System.out.println("notified observer");
        this.temperatureValue = temperature;

    }

    public void display(TemperatureStrategy strategy) {

        System.out.println(strategy.getTemperature(temperatureValue));

    }
}
