package com.company;

import java.util.Scanner;

public class main_1 {
    //do while�� �ݺ��� �ۼ�
    public static void main(String[] args) {

        do{//�ݺ��ؼ� ���������ϱ����ؼ� ���ѷ���
            System.out.println("Hidden number is created. Try it!!");

            int ans = (int)(Math.random() * 100);//0~99 ���� ���� ��� ���ؼ�
            game(ans);//���� ���߱� ���� ����
            int a = check();// ���� ������ ������ Ȯ���ϱ� ���ؼ�
            if(a ==2)
                break;
        }while(true);
        return ;
    }

    public static int check(){
        //��� �������� ���� Ȯ��
        Scanner in =new Scanner(System.in);

        do {
            System.out.print("More Game (y/n) >>");// ���� �������� Ȯ��

            String s = in.next();
            char temp = s.charAt(0);

            try {
                if (temp == 'y')
                    return 1;
                else if (temp == 'n')
                    return 2;
                else if(temp=='Y'||temp=='N')
                    throw new NumberFormatException("�빮�ڸ� �Է��߽��ϴ�. �ҹ��ڷ�");
                    // Y/N�� �빮�ڷ� �Է������� �������� ����
                else if(s.length()!=1)
                    throw new NumberFormatException("���ڸ� �ϳ��� �Է����ּ���.");
                    //���ڰ� �ƴ� ���� ���� Ȥ�� �ܾ ������
                else
                    throw new NumberFormatException("�߸��� ���ڸ� �Է��߽��ϴ�.");
                //y/n�� �ƴ� ���ڸ� �Է����� ��
            }
            catch (NumberFormatException e) {
                System.out.println( e.getMessage() +" �ٽ� �Է����ּ���.");
            }
        }while(true);

    }


    public static void game( int ans){
        Scanner in =new Scanner(System.in);
        do{
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
        }while(true);
        return ;
    }
}
