package strategypattern;

public class Main
{
    public static void main(String[] args){
        Vehicle plane = new Plane();
        System.out.println("Plane: ");
        plane.fly();
        
        Vehicle chopper = new Chopper();
        System.out.println("Chopper: ");
        chopper.fly();
    }
}
