package strategy;

import strategy.flying.FlyWithWings;
import strategy.driving.DriveOnRunway;

public class Plane extends Vehicle
{
    public Plane(){
        flyingBehaviour = new FlyWithWings();
        drivingBehaviour = new DriveOnRunway();
    }
}
