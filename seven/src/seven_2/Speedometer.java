package seven_2;

import java.util.ArrayList;


public class Speedometer implements Subject {
    private ArrayList<Observer> observers;
    private int currentSpeed;

    public Speedometer(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void removeObserver(Observer o) {
        int idx = observers.indexOf(o);
        if(idx>=0)
            observers.remove(idx);
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void notifyObserver(){
        for(Observer o:observers){
            o.update(currentSpeed);
        }
    }
    public void setChanged(){
        notifyObserver();
    }
    public void setCurrentSpeed(int speed){
        this.currentSpeed =speed;
        setChanged();
    }

}
