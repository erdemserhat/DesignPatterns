package decorator;

public class ComputerWithGraphicalCard extends ComputerDecorator{


    public ComputerWithGraphicalCard(ComputerContract computer) {
        super(computer);
    }

    @Override
    public String getDescription() {
        return super.getDescription() +" with Graphical Card";
    }
}
