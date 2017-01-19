package strategypattern.flying;

public class FlyWithRotor implements IFlyingBehaviour
{
    @Override public void fly(){
        System.out.println("Flying with rotor!");
    }
}
