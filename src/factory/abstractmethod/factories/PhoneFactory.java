package factory.abstractmethod.factories;

import factory.abstractmethod.phone.PhoneContract;

abstract public class PhoneFactory {
    abstract public PhoneContract createPhone();
}
