package com.fourth;

import java.util.Scanner;

public class WorldGameApp {
    Scanner in= new Scanner(System.in);

    public void run(){
        int num;
        System.out.print(" 게임에 참가하는 인원은 몇명입니까 >> ");
        num=in.nextInt();

        Player[] players = new Player[num];

        for(int i=0; i<num; i++){
            System.out.print(" 참자가의 이름을 입력하세요 >> ");
            players[i].setName();
        }

        int count = 0;
        System.out.println("시작하는 단어는 아버지입니다.");
        String checkWord="아버지";


        while(true) {
            System.out.print(players[count].getName() + ">> ");
            String word = players[count].getWord();

            if(!players[count].checkSuccess(checkWord)){
                System.out.print(players[count].getName() + "이 졌습니다!");
            }
            count=count +1;// 다음 참가자
            count = num%count;// 사용자를 넘어가지 않게 하기위해서
            checkWord =word ;//다음 참가자의 첫단어와 현재 참가자의 마지막 단어를 비교하기 위해서
        }

    }

    public static void main(String[] args) {
        WorldGameApp Game = new WorldGameApp();
        Game.run();
    }
}
class Player{
    Scanner in= new Scanner(System.in);
    private String name;
    private String word;

    public Player(){ }
    public void setName(){
        String n =in.next();
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public String getWord(){
        String w =in.next();
        this.word =w;
        return word;
    }
    public boolean checkSuccess(String preWord) {
        int lastIndex = preWord.length() - 1;
        char lastChar = preWord.charAt(lastIndex);
        char firstChar = word.charAt(0);

        if (lastChar == firstChar)
            return true;
        else
            return false;
    }
}
