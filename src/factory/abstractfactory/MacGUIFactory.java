package factory.abstractfactory;

import factory.abstractfactory.components.Button;
import factory.abstractfactory.components.CheckBox;
import factory.abstractfactory.components.MacButton;
import factory.abstractfactory.components.MacCheckBox;

public class MacGUIFactory implements  GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
