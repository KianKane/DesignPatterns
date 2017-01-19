package strategypattern;

public class Chopper extends Vehicle
{
    public Chopper(){
        flyingBehaviour = new FlyWithRotor();
    }
}
