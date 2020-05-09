import java.util.Scanner;

class People{
    protected String name;
    int age;
    public People(){ }
    public People(int age, String name){
     this.age= age;
     this.name=name;
    }
    public void show(){
        System.out.println("이름 :"+ this.name +" 나이" +this.age);
    }
}

class Student extends People{
    public String school;
    int schoolNumber;
    private char grade;
    public Student(){}
    public Student(int age,String name, String school, char grade,int schoolNumber){
        super(age,name);
        this.school =school;
        this.grade=grade;
        this.schoolNumber=schoolNumber;
    }
    public void show(){
        System.out.println("학생 이름 :"+ this.name +" 학생 나이 : " +this.age+" 학교 : "+this.school+" 학번 : "+this.schoolNumber+"학점 : "+this.grade);
    }
}

class Staff extends Student {
    public String work;
    public Staff(){}
    public Staff(int age,String name,String school,char grade, int schoolNumber, String work){
        super(age,name,school,grade,schoolNumber);
        this.work=work;
    }
    public void show(){
        //System.out.println("이름 :"+ name +"나이 : " +age+" 직업 : "+work+ "학점" +grade) ;
        System.out.println("이름 :"+ name +"나이 : " +age+" 직업 : "+work);
    }
}

public class test {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        System.out.print("몇명의 사람을 만들까요?");
        int count_1 =in.nextInt();
        System.out.print("몇명의 학생을 만들까요?");
        int count_2 =in.nextInt();
        //System.out.print("몇명의 학부모를 만들까요?");
        //int count_3 =in.nextInt();

        People [] peoples =new People[count_1];
        People [] students =new People[count_2];
        //People [] staffs =new People[count_3];
        int i =0;

        while(i<count_1&&count_1!=0) {
            System.out.print((i+1)+"번째 사람의 나이와 이름을 입력해주세요 (나이 이름 순서)");
            int age = in.nextInt();
            String name = in.next();
            peoples[i] = new People(age, name);
            i++;
        }
        i=0;
        while(i<count_2&&count_2!=0) {
            System.out.print((i+1)+"번째 학생의 나이, 이름, 학교, 학점, 학번을 입력해주세요 (나이 이름 순서)");
            int age = in.nextInt();
            String name = in.next();
            String school =in.next();
            char grade =in.next().charAt(0);
            int schoolNumber =in.nextInt();

            students[i] = new Student( age,name, school, grade, schoolNumber);
            i++;
        }
/*
        i=0;
        while(i<count_3) {
            System.out.print((i+1)+"번째 사람의 나이, 이름,학교, 학번, 직업을 입력해주세요 (나이 이름 순서)");
            int age = in.nextInt();
            String name = in.next();
            String school =in.next();
            int schoolNumber =in.nextInt();
            char grade =in.next().charAt(0);
            String work =in.next();

            staffs[i] = new Staff(age,name,school,grade,schoolNumber,work);
            i++;
        }

*/
        int temp_1=0,temp_2=0;
        if(count_1==0)
            System.out.println("사람이 없습니다.");
        else {
            System.out.println("몇 번째 사람이 궁금합니까?");
             temp_1 = in.nextInt();
        }

        if(count_2==0)
            System.out.println("학생이 없습니다.");
        else {
            System.out.println("몇 번째 학생이 궁금합니까?");
            temp_2 = in.nextInt();
        }

        if(temp_1==0 && temp_2 ==0)
            return;
        else if(temp_2==0)
            peoples[temp_1 -1].show();
        else if(temp_1==0)
            students[temp_2-1].show();
        else {
            peoples[temp_1 - 1].show();
            students[temp_2 - 1].show();
        }

        //staffs[temp_3].show();


        if(peoples[temp_1-1] instanceof  People)
            System.out.println("사람 "+temp_1+"은 People 타입입니다.");
        if(students[temp_2-1] instanceof  People)
            System.out.println("학생 "+temp_1+"은 People 타입입니다.");
        if(students[temp_2-1] instanceof  Student)
            System.out.println("학생 "+temp_1+"은 Student 타입입니다.");

        return;

/*        if(count_3==0)
            System.out.println("직원이 없습니다.");
        else{
             System.out.println("몇 번째 직원이 궁금합니까?");
             int temp_3=in.nextInt();
         }
        if (temp_1==0 || temp_2 ==0||temp_3 ==0)
           return;
        */


    }
}