package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while(true){//반복해서 게임진행하기위해서 무한루프
            System.out.println("Hidden number is created. Try it!!");

            int ans = (int)(Math.random() * 100);//0~99 까지 숫자 얻기 위해서
            game(ans);//숫자 맞추기 게임 진행
            int a = check();// 이제 끝내고 싶은지 확인하기 위해서
            if(a ==2)
                break;
        }
        return ;
    }

    public static int check(){
        //계속 진행할지 여부 확인
        Scanner in =new Scanner(System.in);

        while(true) {
            System.out.print("More Game (y/n) >>");// 게임 진행할지 확인

            String s = in.next();
            char temp = s.charAt(0);

            try {
                if (temp == 'y')
                    return 1;
                else if (temp == 'n')
                    return 2;
                else if(temp=='Y'||temp=='N')
                    throw new NumberFormatException("대문자를 입력했습니다. 소문자로");
                    // Y/N을 대문자로 입력했을때 내보내는 예외
                else if(s.length()!=1)
                    throw new NumberFormatException("문자를 하나만 입력해주세요.");
                    //문자가 아닌 여러 문자 혹은 단어를 쳤을때
                else
                    throw new NumberFormatException("잘못된 문자를 입력했습니다.");
                //y/n이 아닌 문자를 입력했을 때
            }
            catch (NumberFormatException e) {
                System.out.println( e.getMessage() +" 다시 입력해주세요.");
            }
        }

    }


    public static void game( int ans){
        Scanner in =new Scanner(System.in);
        while(true) {
            int test = in.nextInt();
            if(test <ans){
                System.out.println("Higher");
            }
            else if(test >ans){
                System.out.println("Lower");
            }
            else if(test ==ans){
                System.out.println("YOU GOT THE ANSWER!!");
                break;
            }
        }
        return ;
    }
}
