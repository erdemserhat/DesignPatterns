package factory.abstractmethod;

import factory.abstractmethod.phone.PhoneContract;
import factory.abstractmethod.phone.PhoneType;

public interface PhoneSellerContract {
    PhoneContract buyPhone(PhoneType phoneType);
}
