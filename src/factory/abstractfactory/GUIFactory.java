package factory.abstractfactory;

import factory.abstractfactory.components.Button;
import factory.abstractfactory.components.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
