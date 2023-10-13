package DesignPattern.StrategyPattern.Duck;

import DesignPattern.StrategyPattern.Duck.Duck;
import DesignPattern.StrategyPattern.Implementation.FlyWithWings;
import DesignPattern.StrategyPattern.Implementation.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {

        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {

        System.out.println("I'm a real Mallard duck");
    }
}
