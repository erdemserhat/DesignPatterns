package factory.abstractmethod.factories;

import factory.abstractmethod.phone.PhoneContract;
import factory.abstractmethod.phone.SamsungPhone;

public class SamsungFactory extends PhoneFactory{
    @Override
    public PhoneContract createPhone() {
        return new SamsungPhone();
    }
}
