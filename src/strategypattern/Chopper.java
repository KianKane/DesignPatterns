package strategypattern;

import strategypattern.flying.FlyWithRotor;

public class Chopper extends Vehicle
{
    public Chopper(){
        flyingBehaviour = new FlyWithRotor();
    }
}
