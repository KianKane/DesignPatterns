package observer;

public class ConcreteObserverA extends Observer
{
    @Override public void update(){
        System.out.println("Concrete Observer A - Subject state is now: " + subject.getState());
    }
}
