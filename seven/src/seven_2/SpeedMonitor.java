package seven_2;

public class SpeedMonitor implements Observer,DisplayElement {
    private Subject speedo;
    private int id;
    private int speed;

    public static final int SPEED_TO_ALERT =70;
    public SpeedMonitor(Subject speedo,int id){
        this.speedo =speedo;
        this.id=id;
        speedo.registerObserver(this);
    }

    @Override
    public void update(int currentSpeed) {
        this.speed =currentSpeed;
        display();
    }

    @Override
    public void display() {
        if(speed>SPEED_TO_ALERT)
            System.out.println("Car "+id+": "+"**ALERT ** Driving too fast! (" + speed + ")");
        else
            System.out.println("Car "+id+": "+"... nice and steady ... (" + speed + ")");
    }
}
