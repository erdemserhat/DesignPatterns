package factory.abstractmethod.phone;

public class SamsungPhone implements PhoneContract {
    @Override
    public String getDescription() {
        return "SAMSUNG";
    }
}
