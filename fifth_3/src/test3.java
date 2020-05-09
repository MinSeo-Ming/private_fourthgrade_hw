public class test3 {
    public static void main(String []args){
        Rect r = new Rect();
        r.printStart();
        r.showName();
        r.showColor();
    }
}
interface Shape {
    public static final String color ="red";
    public void showName();//추상 메소드
    public void showColor();//추상 메소드
    default  void printStart(){//default 메소드
        System.out.println("==도형입니다!==");
    }
}

class Rect implements Shape{

    @Override
    public void showName() {
        System.out.println("도형의 이름은 Rectangle");
    }
    @Override
    public void showColor() {
        System.out.println("Rectangle의 색상은 " + color);
    }

}