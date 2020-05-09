package sixth;
import java.util.Scanner;

public class Bear extends Gameobject {
    Scanner in =new Scanner(System.in);

    public Bear(int x,int y,int distance){
        super(x,y,distance);
    }
    public void move(){
        temp_x =x;// 이동하기 전 bear의 x 위치
        temp_y =y;// 이동하기 전 bear의 y 위치

        String input =in.next();
        char c = input.charAt(0);

        switch (c){
            case'a':
                y=y-distance;
                if(y<=0)// bear의 위치가 가장 왼쪽일 때, 위치를 벗어나지 않기 위해서
                    y=0;
                break;

            case's':
                x=x+distance;
                if(x>=9)//bear의 위치가 가장 아래 일때, 위치를 벗어나지 않기 위해서
                    x=9;
                break;
            case'd':
                x=x-distance;
                if(x<=0)//bear의 위치가 가장 위 일때, 위치를 벗어나지 않기 위해서
                    x=0;
                break;
            case'f':
                y=y+distance;
                if(y>=19)//bear의 위치가 가장 오른쪽 일때, 위치를 벗어나지 않기 위해서
                    y=19;
                break;
        }
    }
    @Override
    public char getShape() {
        return 'B';
    }
}
