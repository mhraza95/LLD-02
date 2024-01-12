package DesignPattern.FactoryMethod.Factory;

import DesignPattern.FactoryMethod.Buttons.Button;
import DesignPattern.FactoryMethod.Buttons.HtmlButton;

public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
