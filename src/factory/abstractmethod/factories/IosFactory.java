package factory.abstractmethod.factories;

import factory.abstractmethod.phone.PhoneContract;
import factory.abstractmethod.phone.IosPhone;

public class IosFactory extends PhoneFactory{
    @Override
    public PhoneContract createPhone() {
        return new IosPhone();
    }
}
