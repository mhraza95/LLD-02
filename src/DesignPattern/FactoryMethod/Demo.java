package DesignPattern.FactoryMethod;

import DesignPattern.FactoryMethod.Factory.Dialog;
import DesignPattern.FactoryMethod.Factory.HtmlDialog;
import DesignPattern.FactoryMethod.Factory.WindowsDialog;

public class Demo {

    public static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {

        if(System.getProperty("os.name").equals("Windows 11")) {

            dialog = new WindowsDialog();
        }else {

            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
