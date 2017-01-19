package strategypattern;

import strategypattern.flying.IFlyingBehaviour;
import strategypattern.driving.IDrivingBehaviour;

public class Vehicle
{
    protected IFlyingBehaviour flyingBehaviour;
    protected IDrivingBehaviour drivingBehaviour;
    
    public void fly(){
        flyingBehaviour.fly();
    }
    
    public void drive(){
        drivingBehaviour.drive();
    }
    
    public void setFlyingBehaviour(IFlyingBehaviour flyingBehaviour){
        this.flyingBehaviour = flyingBehaviour;
    }
    
    public void setDrivingBehaviour(IDrivingBehaviour drivingBehaviour){
        this.drivingBehaviour = drivingBehaviour;
    }
}
