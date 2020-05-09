public class test {
    public static void main(String []args){
        System.out.println("32174224 조민서 /Design Pattern  6주차 과제");
        AbstractCar myCar = new Sport(new StandardEngine(2000));
        myCar.setSpeed(20);
        myCar.setSpeed(40);
        System.out.println("Switching on sports mode gearbox...");
        myCar.setGearboxStrategy(new SportGearboxStrategy());
        myCar.setSpeed(20);
        myCar.setSpeed(40);

    }
}
