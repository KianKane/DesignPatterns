package singleton;

public class Announcer
{
    private static Announcer instance;
    public static Announcer getInstance(){
        if (instance == null){
            synchronized(Announcer.class){
                if (instance == null){
                    instance = new Announcer();
                }
            }
        }
        return instance;
    }
    
    private String greeting;
            
    private Announcer(){
        greeting = "Well Met!";
    }
    
    public void greet(){
        System.out.println(greeting);
    }
    
    public void setGreeting(String greeting){
        this.greeting = greeting;
    }
}
