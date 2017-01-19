package strategypattern.driving;

public class DriveOnRoad implements IDrivingBehaviour
{
    @Override public void drive(){
        System.out.println("Driving on road!");
    }
}
