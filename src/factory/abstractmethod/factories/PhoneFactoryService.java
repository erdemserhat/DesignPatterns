package factory.abstractmethod.factories;

import factory.abstractmethod.phone.PhoneContract;
import factory.abstractmethod.phone.PhoneType;

public class PhoneFactoryService {
    private PhoneFactory phoneFactory;
    public PhoneContract createPhone(PhoneType phoneType){

        switch (phoneType) {
            case PhoneType.IPHONE -> phoneFactory = new IosFactory();
            case PhoneType.GOOGLE_PIXEL -> phoneFactory = new GoogleFactory();
            case PhoneType.LENOVO -> phoneFactory = new LenovoFactory();
            case PhoneType.SAMSUNG -> phoneFactory = new SamsungFactory();

        }

        return phoneFactory.createPhone();

    }
}
