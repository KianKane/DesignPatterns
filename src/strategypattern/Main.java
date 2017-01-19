package strategypattern;

public class Main
{
    public static void main(String[] args){
        testFlyingBehaviours();
    }
    
    public static void testFlyingBehaviours(){
        Vehicle plane = new Plane();
        System.out.println("Plane: ");
        plane.fly();
        
        Vehicle chopper = new Chopper();
        System.out.println("Chopper: ");
        chopper.fly();
    }
}
