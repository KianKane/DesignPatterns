package strategypattern;

import strategypattern.flying.FlyWithWings;
import strategypattern.driving.DriveOnRunway;

public class Plane extends Vehicle
{
    public Plane(){
        flyingBehaviour = new FlyWithWings();
        drivingBehaviour = new DriveOnRunway();
    }
}
