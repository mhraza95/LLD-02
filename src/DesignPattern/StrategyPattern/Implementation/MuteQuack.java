package DesignPattern.StrategyPattern.Implementation;

import DesignPattern.StrategyPattern.Behaviour.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {

        System.out.println("<< Silence >>");
    }
}
