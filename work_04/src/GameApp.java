import java.util.Scanner;

public class GameApp {

    Scanner in = new Scanner(System.in);

    public void run(){
        System.out.println("끝말 잇기 게임을 시작합니다!!");
        System.out.print("게임에 참가하는 인원은 몇명입니까? >>");

        int num =in.nextInt();//참가 인원을 물어본다.
        Player players[];//플레이어 배열
        players=new Player[num];// 사용자에게 입력 받은 수만큼 할당한다.

        for(int i =0; i<num; i++){
            System.out.print("참가자의 이름을 입력하세요 >> ");
            players[i]=new Player();// 플레이어 생성자를 할당하고
            players[i].setName();//플레이어에게 이름을 줍니다.
        }

        System.out.println("시작하는 단어는 아버지 입니다.");
        int count =0; // 플레이어 순서를 지정하기 위해서
        String startWord ="아버지"; //끝말잇기를 하기 위해서 시작하는 단어를 아버지라고 한다.

        while(true){ // 끝말잇기가 누군가가 틀리기 전까지 계속
            System.out.print(players[count].getName() + " >> ");
            String word = players[count].getWord();

            if(!players[count].checkSuccess(startWord)){ //끝말잇기가 틀리면 종료
                System.out.println(players[count].getName()+"이 졌습니다.");
                break;
            }
            count++; //다음 플레이어로 넘어가기 위해서
            count%=players.length; //count가 플레이어 숫자를 넘어가지 않게 하기 위해서
            startWord=word;// 다음 사람들이 전 사람의 단어로 끝말잇기를 하기 위해서 이렇게 합니다.
        }

    }
    public static void main(String args[]){
        GameApp game = new GameApp();
        game.run();
    }
}

class Player{
    Scanner in =new Scanner(System.in);
    private String name;
    private String word;

    Player(){ }

    public void setName(){
        String name = in.next();
        this.name =name;
    }

    public String getName(){
        return this.name;
    }

    public String getWord(){
        String word = in.next();
        this.word =word;
        return this.word;
    }

    public boolean checkSuccess(String compareWord){
        int lastIndex = compareWord.length()-1; //전단어의 마지막 글자의 index
        char lastChar =compareWord.charAt(lastIndex);//전단어의 마지막 글자
        char firstChar =this.word.charAt(0);// 현재 내 단어의 첫 글자

        if(lastChar==firstChar) //만약 둘이 동일하면, true를 반환
            return true;

        else //둘이 동일하지 않다면,false를 반환
            return false;
    }

}

