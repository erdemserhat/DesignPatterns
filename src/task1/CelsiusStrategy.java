package task1;

public class CelsiusStrategy implements TemperatureStrategy {

    @Override
    public Double getTemperature(Double value){
        return value+250;
    }
}
