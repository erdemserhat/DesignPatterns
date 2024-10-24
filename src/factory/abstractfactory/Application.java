package factory.abstractfactory;

import factory.abstractfactory.components.Button;
import factory.abstractfactory.components.CheckBox;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void render(){
        System.out.println(button.render());
        System.out.println( checkBox.render());

    }
}
