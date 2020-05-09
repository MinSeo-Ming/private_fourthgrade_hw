import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String argsp[]){
        Scanner in= new Scanner(System.in);
        Random rand =new Random();

        int []alloc=new int[4];
        make(alloc);

        Bear bear =new Bear(alloc[0],alloc[1],1);
        Fish fish =new Fish(alloc[2],alloc[3],1);

        Map map =new Map();
        map.set_location(bear);
        map.set_location(fish);
        System.out.println("소프트웨어학과 32174224 조민서의 물고기 곰 잡기 게임!!");
        System.out.println("------------------------------------------------\n");
        while(true){
            map.show_Array();
            System.out.print("\n왼쪽 (a),아래쪽 (s), 위쪽 (d), 오른쪽 (f) >> ");

            bear.move();
            map.moved_location(bear);

            if(bear.collide(fish)){
                map.show_Array();
                System.out.println("\t\t곰이 이겼습니다!");
                break;
            }

            int check =(int)(Math.random()*10)+1;

            if(check>5) {
                fish.move();
                map.moved_location(fish);
            }
            else if(fish.collide(bear)){
                fish.move();
                map.moved_location(fish);
            }
            map.moved_location(fish);
        }
    }
    public static void make(int[] alloc){
        Random rand =new Random();
        int []temp=new int[4];
        while(true) {
            temp[0]= (int) rand.nextInt(9);// bear x 좌표를 랜덤으로 주기 위해서
            temp[1] = (int) rand.nextInt(19); //bear의 y
            temp[2]= (int) rand.nextInt(9);//fish x 좌표를 랜덤으로 주기 위해서
            temp[3]= (int) rand.nextInt(19);

            if (temp[0] != temp[2] || temp[1] != temp[3]) // bear fish각각의 x ,y 좌표가 동일하지 않기 위해서.
                break;
        }
        for(int i=0; i<alloc.length; i++)
            alloc[i]=temp[i];
    }
}
