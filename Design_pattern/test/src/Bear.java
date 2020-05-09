import java.util.Scanner;

public class Bear extends Gameobject {
    Scanner in =new Scanner(System.in);

    public Bear(int x,int y,int distance){
        super(x,y,distance);
    }
    public void move(){
        temp_x =x;
        temp_y =y;

        String input =in.next();
        char c = input.charAt(0);

        switch (c){
            case'a':
                y=y-distance;
                if(y<=0)
                    y=0;
                break;

            case's':
                x=x+distance;
                if(x>=9)
                    x=9;
                break;
            case'd':
                x=x-distance;
                if(x<=0)
                    x=0;
                break;
            case'f':
                y=y+distance;
                if(y>=19)
                    y=19;
                break;
        }
    }
    @Override
    public char getShape() {
        return 'B';
    }
}
