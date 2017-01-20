package observer;

import java.util.ArrayList;

public class Subject
{
    private ArrayList<Observer> observers;
    private int state;
    
    public Subject(){
        observers = new ArrayList<>();
        state = 0;
    }
    
    public void attatch(Observer observer){
        observers.add(observer);
        observer.subject = this;
    }
    
    public int getState(){
        return state;
    }
    
    public void setState(int state){
        this.state = state;
        updateObservers();
    }
    
    private void updateObservers(){
        for(Observer o : observers){
            o.update();
        }
    }
}
