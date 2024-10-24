package factory.abstractfactory;

import factory.abstractfactory.components.Button;
import factory.abstractfactory.components.CheckBox;
import factory.abstractfactory.components.WindowsButton;
import factory.abstractfactory.components.WindowsCheckBox;

public class WindowsGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
