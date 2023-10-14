import DesignPattern.StrategyPattern.Duck.Duck;
import DesignPattern.StrategyPattern.Duck.MallardDuck;
import DesignPattern.StrategyPattern.Duck.ModelDuck;
import DesignPattern.StrategyPattern.Implementation.FlyRocketPowered;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();

        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}