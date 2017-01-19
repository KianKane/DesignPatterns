package strategypattern;

import strategypattern.flying.FlyWithWings;

public class Plane extends Vehicle
{
    public Plane(){
        flyingBehaviour = new FlyWithWings();
    }
}
