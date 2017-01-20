package observer;

public class Main
{
    public static void main(String[] args){
        testObserver();
    }
    
    private static void testObserver(){
        System.out.println("\n--- Testing Announcer Singleton ---");
        Subject subject = new Subject();
        subject.attatch(new ConcreteObserverA());
        subject.attatch(new ConcreteObserverB());
        System.out.println("Changing subject state...");
        subject.setState(12);
        System.out.println("Changing subject state...");
        subject.setState(54);
    }
}
