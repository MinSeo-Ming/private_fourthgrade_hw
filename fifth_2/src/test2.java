public class test2 {
    public static void main(String args[]){
        Elment e =new Elment();
        Middle m =new Middle();
        High h =new High();
        e.getSchoolName();
        m.getSchoolName();
        h.getSchoolName();
    }
}

abstract class School{
    public School(){}
    String schoolName;
    abstract public void getSchoolName();
}

class Elment extends School{
    String schoolName ="단국초등학교";
    @Override
    public void getSchoolName(){//추상 메소드 구현
        System.out.println("초등학교 이름 : "+this.schoolName);
    }
}

class Middle extends School{
    String schoolName ="단국중학교";
    @Override
    public void getSchoolName(){//추상 메소드 구현
        System.out.println("중학교 이름 : "+this.schoolName);
    }
}

class High extends School{//추상 메소드 구현
    String schoolName ="단국고등학교";
    @Override
    public void getSchoolName(){
        System.out.println("고등학교 이름 : "+this.schoolName);
    }
}