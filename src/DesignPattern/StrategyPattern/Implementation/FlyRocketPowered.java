package DesignPattern.StrategyPattern.Implementation;

import DesignPattern.StrategyPattern.Behaviour.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public void fly() {

        System.out.println("I'm flying with a rocket");
    }
}
