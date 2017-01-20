package strategy;

import strategy.driving.DriveOnRoad;

public class Car extends Vehicle
{
    public Car(){
        drivingBehaviour = new DriveOnRoad();
    }
}
