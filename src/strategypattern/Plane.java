package strategypattern;

public class Plane extends Vehicle
{
    public Plane(){
        flyingBehaviour = new FlyWithWings();
    }
}
