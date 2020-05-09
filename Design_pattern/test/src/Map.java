
public class Map {
    char[][] map;
    public Map(){
        map =new char[10][20];
        for(int i=0; i<10; i++){
            for(int j=0; j<20; j++)
                map[i][j]='-';
        }
    }

    public void set_location(Gameobject obj){
        int x =obj.getX();
        int y= obj.getY();
        map[x][y]= obj.getShape();
    }

    public void moved_location(Gameobject obj){
        try{
            int t_x =obj.get_tempX();
            int t_y= obj.get_tempY();
            map[t_x][t_y]='-';
            int x =obj.getX();
            int y= obj.getY();
            map[x][y]= obj.getShape();
        }
        catch (Exception e){
            obj.y= obj.temp_y;
            obj.x= obj.temp_x;
        }
    }

    public void show_Array(){
        for(int i=0; i<map.length; i++){
            System.out.print("\t\t");
            for(int j =0; j<map[i].length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
