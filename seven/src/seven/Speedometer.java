package seven;

import java.util.Observable;

public class Speedometer extends Observable {
    int currentSpeed;
    public void setCurrentSpeed(int speed){
        this.currentSpeed =speed;
        setChanged();
        notifyObservers();
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }


    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }

}
