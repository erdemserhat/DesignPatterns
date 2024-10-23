package decorator;

public class ComputerWithExtraLargeScreen extends ComputerDecorator{
    private Double inch;

    public ComputerWithExtraLargeScreen(ComputerContract computer, Double inch){
        super(computer);
        this.inch = inch;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +" with "+inch+" inch";
    }
}
