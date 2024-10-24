package factory.simplefactory.computer;

public class Computer implements ComputerContract{
    @Override
    public String getDescription() {
        return "Standard Computer";
    }
}
