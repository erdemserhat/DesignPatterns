package factory.simplefactory;

import factory.simplefactory.computer.ComputerContract;
import factory.simplefactory.computer.ComputerType;

public interface ComputerSellerContract {
    ComputerContract sellComputer(ComputerType computerType);

}
