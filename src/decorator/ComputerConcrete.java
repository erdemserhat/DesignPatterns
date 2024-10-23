package decorator;

public class ComputerConcrete implements ComputerContract {

    @Override
    public String getDescription() {
        return "Standard Computer";
    }
}
