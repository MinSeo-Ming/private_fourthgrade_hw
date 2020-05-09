package sixth;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void make(int[] alloc){ // 곰과 몰고기의 위치를 무작위로 설정하기 위한 함수
        Random rand =new Random();
        int []temp=new int[4];
        while(true) {
            temp[0]= (int) rand.nextInt(9);// bear x 좌표를 무작위로 주기 위해서
            temp[1] = (int) rand.nextInt(19); //bear의 y
            temp[2]= (int) rand.nextInt(9);//fish x 좌표를 무작위로 주기 위해서
            temp[3]= (int) rand.nextInt(19);//fish의 y

            if (temp[0] != temp[2] || temp[1] != temp[3]) // bear fish 각각의 x ,y 좌표가 동일하지 않기 위해서.
                break;
        }
        for(int i=0; i<alloc.length; i++)
            alloc[i]=temp[i];
    }

    public static void main(String argsp[]){
        Scanner in= new Scanner(System.in);
        Random rand =new Random();

        int []alloc=new int[4];
        make(alloc);

        Bear bear =new Bear(alloc[0],alloc[1],1);//곰의 x,y좌표 할당 하여 객체 생성
        Fish fish =new Fish(alloc[2],alloc[3],1);//물고기의 x,y좌표 할당 하여 객체 생성

        Map map =new Map();// 게임판 새성
        map.set_location(bear);//게임판에 곰위치 표시
        map.set_location(fish);//게임판에 물고기위치 표시
        System.out.println("소프트웨어학과 3217**** 조민서의 물고기 곰 잡기 게임!!");
        System.out.println("------------------------------------------------\n");
        while(true){
            map.show_Array();
            System.out.print("\n왼쪽 (a),아래쪽 (s), 위쪽 (d), 오른쪽 (f) >> ");
            bear.move();
            map.moved_location(bear);

            if(bear.collide(fish)){//곰과 물고기가 충돌할 경우
                map.show_Array();
                System.out.println("\t\t곰이 이겼습니다!");
                break;
            }

            int check =(int)(Math.random()*10)+1;

            if(check>5) {//물고기는 10번중 4번만 움직이기 위해서 6이상 일때만 움직인다.
                fish.move();
                map.moved_location(fish);
            }
            else if(fish.collide(bear)){//만약에 물고기가 곰 쪽으로 이동 하면 한번더 움직이기
                fish.move();
                map.moved_location(fish);
            }
            map.moved_location(fish);//움직이지 않더라도 지도에 물고기를 표시하기 위해서
        }
    }

}
