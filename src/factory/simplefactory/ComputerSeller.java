package factory.simplefactory;

import factory.simplefactory.computer.ComputerContract;
import factory.simplefactory.computer.ComputerType;

public class ComputerSeller implements ComputerSellerContract {
    private ComputerFactory computerFactory = new ComputerFactory();
    @Override
    public ComputerContract sellComputer(ComputerType type) {

        ComputerContract computerContract = computerFactory.createComputer(type);

        return computerContract;
    }
}
