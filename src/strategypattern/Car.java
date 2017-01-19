package strategypattern;

import strategypattern.driving.DriveOnRoad;

public class Car extends Vehicle
{
    public Car(){
        drivingBehaviour = new DriveOnRoad();
    }
}
