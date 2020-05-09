package seven;

import java.util.Observable;
import java.util.Observer;

public class SpeedMonitor implements Observer {
    Observable observable;
    public static final int SPEED_TO_ALERT =70;
    @Override
    public void update(Observable obs, Object obj){
        if(obs instanceof Speedometer){
            Speedometer speedo =(Speedometer)obs;
            if(speedo.getCurrentSpeed()>SPEED_TO_ALERT)
                System.out.println("**ALERT ** Driving too fast! (" + speedo.getCurrentSpeed() + ")");
            else
                System.out.println("... nice and steady ... (" + speedo.getCurrentSpeed() + ")");
        }
    }
}
