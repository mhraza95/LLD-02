package DesignPattern.StrategyPattern.Implementation;

import DesignPattern.StrategyPattern.Behaviour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I can't fly!!");
    }
}
