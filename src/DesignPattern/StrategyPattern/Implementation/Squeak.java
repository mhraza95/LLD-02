package DesignPattern.StrategyPattern.Implementation;

import DesignPattern.StrategyPattern.Behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {

        System.out.println("Squeak");
    }
}
