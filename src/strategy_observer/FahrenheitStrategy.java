package strategy_observer;

public class FahrenheitStrategy implements  TemperatureStrategy{

    @Override
    public Double getTemperature(Double value) {
        return value+232;
    }
}
