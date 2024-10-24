package factory.abstractmethod;

import factory.abstractmethod.factories.PhoneFactoryService;
import factory.abstractmethod.phone.PhoneContract;
import factory.abstractmethod.phone.PhoneType;

public class PhoneSeller implements PhoneSellerContract {
    @Override
    public PhoneContract buyPhone(PhoneType phoneType) {
        PhoneFactoryService factory = new PhoneFactoryService();
        return factory.createPhone(phoneType);
    }
}
