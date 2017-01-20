package strategy;

import strategy.flying.FlyWithRotor;

public class Chopper extends Vehicle
{
    public Chopper(){
        flyingBehaviour = new FlyWithRotor();
    }
}
