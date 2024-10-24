package factory.abstractmethod.factories;

import factory.abstractmethod.phone.PhoneContract;
import factory.abstractmethod.phone.GooglePhone;

public class GoogleFactory extends PhoneFactory{
    @Override
    public PhoneContract createPhone() {
        return new GooglePhone();
    }
}
