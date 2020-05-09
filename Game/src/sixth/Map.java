package sixth;

public class Map {
    char[][] map;
    public Map(){ //게임판 생성! 및 -으로 초기화
        map =new char[10][20];
        for(int i=0; i<10; i++){
            for(int j=0; j<20; j++)
                map[i][j]='-';
        }
    }

    public void set_location(Gameobject obj){
        //객체의 위치를 게임판 위에 표시
        int x =obj.getX();
        int y= obj.getY();
        map[x][y]= obj.getShape();
    }

    public void moved_location(Gameobject obj){
        //객체의 위치가 이동할 시 그 전 위치는 -으로 표시 게임판 위에 새로운 위치에 객체 표시
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
        //게임판인 지도를 보여 준다.
        for(int i=0; i<map.length; i++){
            System.out.print("\t\t");
            // 왼쪽에 너무 붙어 있으면 게임판을 보기 힘들어 정렬 해준다.
            for(int j =0; j<map[i].length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
