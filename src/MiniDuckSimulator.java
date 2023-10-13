import DesignPattern.StrategyPattern.Duck.Duck;
import DesignPattern.StrategyPattern.Duck.MallardDuck;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

    }
}