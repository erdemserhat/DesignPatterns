package factory.abstractmethod.phone;

public class IosPhone  implements PhoneContract {
    @Override
    public String getDescription() {
        return "APPLE PHONE";
    }
}
