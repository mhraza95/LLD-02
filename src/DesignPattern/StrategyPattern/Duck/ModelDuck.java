package DesignPattern.StrategyPattern.Duck;

import DesignPattern.StrategyPattern.Implementation.FlyNoWay;
import DesignPattern.StrategyPattern.Implementation.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {

        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {

        System.out.println("I'm a model Duck");
    }
}
