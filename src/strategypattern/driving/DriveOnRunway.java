package strategypattern.driving;

public class DriveOnRunway implements IDrivingBehaviour
{
    @Override public void drive(){
        System.out.println("Driving on runway!");
    }
}
