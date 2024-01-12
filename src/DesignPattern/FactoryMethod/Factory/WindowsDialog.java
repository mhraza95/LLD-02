package DesignPattern.FactoryMethod.Factory;

import DesignPattern.FactoryMethod.Buttons.Button;
import DesignPattern.FactoryMethod.Buttons.WindowsButton;

public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
