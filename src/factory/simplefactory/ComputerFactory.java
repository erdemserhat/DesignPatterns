package factory.simplefactory;

import factory.simplefactory.computer.*;

public class ComputerFactory {
    public ComputerContract createComputer(ComputerType computerType) {
        switch (computerType) {
            case GAME_COMPUTER:
                return new GameComputer();
            case OFFICE_COMPUTER:
                return new OfficeComputer();
            case STANDARD_COMPUTER:
                return new Computer();
            case SUPER_COMPUTER:
                return new SuperComputer();
            default:
                throw new IllegalArgumentException("Unknown computer type: " + computerType);
        }


    }
}
