package factory.abstractmethod.factories;

import factory.abstractmethod.phone.PhoneContract;
import factory.abstractmethod.phone.LenovoPhone;

public class LenovoFactory extends PhoneFactory{
    @Override
    public PhoneContract createPhone() {
        return new LenovoPhone();
    }
}
