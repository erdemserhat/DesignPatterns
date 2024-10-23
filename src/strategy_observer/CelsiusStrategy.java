package strategy_observer;

public class CelsiusStrategy implements TemperatureStrategy {

    @Override
    public Double getTemperature(Double value){
        return value+250;
    }
}
