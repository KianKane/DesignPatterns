package singleton;

public class Main
{
    public static void main(String[] args){
        testSingleton();
    }
    
    private static void testSingleton(){
        System.out.println("\n--- Testing Announcer Singleton ---");
        Announcer.getInstance().greet();
        System.out.println("Changing announcer greeting...");
        Announcer.getInstance().setGreeting("Greetings Traveller.");
        Announcer.getInstance().greet();
    }
}
