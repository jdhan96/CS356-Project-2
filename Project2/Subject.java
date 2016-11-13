
import java.util.ArrayList;
import java.util.List;

//subject pattern
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    
    public void attach(Observer name) {
        observers.add(name);
    }
    public void notifyObserver() {
        for(Observer i : observers) {
            i.update(this);
        }
    }
}
