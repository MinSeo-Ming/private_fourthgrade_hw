package sixth;
public class Fish extends Gameobject {
    public Fish(int x,int y,int distance){
        super(x,y,distance);
    }
    public void move(){
        temp_x =x;// 이동 하기 전 fish의 x 위치
        temp_y =y;// 이동 하기 전 fish의 y 위치

        int check =(int)(Math.random()*4);// 무작위 로 fish의 이동할 위치 정하기

        switch (check){
            case 0:
                y=y-distance;
                if(y<=0)//fish 의 위치가 가장 왼쪽일 때, 위치를 벗어 나지 않기 위해서
                    y=0;
                break;
            case 1:
                x=x+distance;
                if(x>=9)//fish 의 위치가 가장 아래 때, 위치를 벗어 나지 않기 위해서
                    x=9;
                break;
            case 2:
                x=x-distance;
                if(x<=0)//fish 의 위치가 가장 위일 때, 위치를 벗어 나지 않기 위해서
                    x=0;
                break;
            case 3:
                y=y+distance;
                if(y>=19)//fish 의 위치가 가장 오른쪽 일 때, 위치를 벗어 나지 않기 위해서
                    y=19;
                break;
        }
    }

    @Override
    public char getShape() {
        return 'F';
    }
}

