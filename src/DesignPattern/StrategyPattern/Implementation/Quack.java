package DesignPattern.StrategyPattern.Implementation;

import DesignPattern.StrategyPattern.Behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {

        System.out.println("Quack");
    }
}
