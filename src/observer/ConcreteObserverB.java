package observer;

public class ConcreteObserverB extends Observer
{
    @Override public void update(){
        System.out.println("Concrete Observer B - Subject state is now: " + subject.getState());
    }
}
