package seven_2;

import java.util.Scanner;

public class main {
    public static void main(String []args){
        Speedometer speedo =new Speedometer();
        SpeedMonitor current[];
        System.out.println("32174224 조민서 // Design pattern 7주차 과제");

        System.out.print("몇 개의 차를 만들고 싶습니까?  ");
        Scanner in = new Scanner(System.in);
        int number =in.nextInt();
        current=new SpeedMonitor[number];

        for(int i=0; i<number; i++)
            current[i] = new SpeedMonitor(speedo, i+1);

        speedo.setCurrentSpeed(50);
        speedo.setCurrentSpeed(70);
        speedo.setCurrentSpeed(40);
        speedo.setCurrentSpeed(100);
        speedo.setCurrentSpeed(69);
    }
}
