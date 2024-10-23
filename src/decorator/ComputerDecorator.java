package decorator;

public class ComputerDecorator implements ComputerContract  {
    ComputerContract computer;

    public ComputerDecorator(ComputerContract computer) {
        this.computer = computer;
    }

    @Override
    public String getDescription() {
        return computer.getDescription();
    }
}
