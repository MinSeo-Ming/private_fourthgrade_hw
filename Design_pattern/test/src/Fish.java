public class Fish extends Gameobject {
    public Fish(int x,int y,int distance){
        super(x,y,distance);
    }
    public void move(){
        temp_x =x;
        temp_y =y;

        int check =(int)(Math.random()*4);

        switch (check){
            case 0:
                y=y-distance;
                if(y<=0)
                    y=0;
                break;
            case 1:
                x=x+distance;
                if(x>=9)
                    x=9;
                break;
            case 2:
                x=x-distance;
                if(x<=0)
                    x=0;
                break;
            case 3:
                y=y+distance;
                if(y>=19)
                    y=19;
                break;
        }
    }

    @Override
    public char getShape() {
        return 'F';
    }
}
