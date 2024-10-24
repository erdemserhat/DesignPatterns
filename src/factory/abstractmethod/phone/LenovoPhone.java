package factory.abstractmethod.phone;

public class LenovoPhone implements PhoneContract {
    @Override
    public String getDescription() {
        return "Lenovo Phone";
    }
}
