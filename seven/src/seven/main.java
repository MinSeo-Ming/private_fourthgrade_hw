package seven;

public class main {
    public static void main(String []args){
        SpeedMonitor monitor=new SpeedMonitor();
        Speedometer speedo =new Speedometer();
        speedo.addObserver(monitor);

        System.out.println("32174224 조민서 Design pattern 7주차 출석!!");
        speedo.setCurrentSpeed(50);
        speedo.setCurrentSpeed(70);
        speedo.setCurrentSpeed(40);
        speedo.setCurrentSpeed(100);
        speedo.setCurrentSpeed(69);

    }
}
