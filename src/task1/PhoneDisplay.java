package task1;

public class PhoneDisplay implements WeatherObserver{
    private Double temperatureValue;
    @Override
    public void update(Double temperature) {
        this.temperatureValue = temperature;

    }

    public void display(TemperatureStrategy strategy) {

        System.out.println(strategy.getTemperature(temperatureValue));

    }
}
