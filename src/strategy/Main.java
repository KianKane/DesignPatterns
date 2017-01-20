package strategy;

public class Main
{
    public static void main(String[] args){
        testFlyingBehaviours();
        testDrivingBehaviours();
    }
    
    private static void testFlyingBehaviours(){
        System.out.println("\n--- Testing Flying Behaviours ---");
        Vehicle plane = new Plane();
        System.out.println("Plane: ");
        plane.fly();
        
        Vehicle chopper = new Chopper();
        System.out.println("Chopper: ");
        chopper.fly();
    }
    
    private static void testDrivingBehaviours(){
        System.out.println("\n--- Testing Driving Behaviours ---");
        Vehicle car = new Car();
        System.out.println("Car: ");
        car.drive();
        
        Vehicle plane = new Plane();
        System.out.println("Plane: ");
        plane.drive();
    }
}
