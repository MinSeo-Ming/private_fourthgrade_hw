package eight_1;

public class main {
    public static void main(String args[]){
        System.out.println("조민서 32174224/ Design Pattern 8주차 과제\n\n");

        Vehicle myCar =new Saloon(new StandardEngine(1300));
        myCar.paint(Vehicle.Colour.BLUE);
        System.out.println(myCar);

        myCar =new AirConditionedVehicle(myCar);
        System.out.println(myCar);

        myCar=new AlloyWheeledVehicle(myCar);
        System.out.println(myCar);

        myCar =new LeatherSeatedVehicle(myCar);
        System.out.println(myCar);

        myCar =new MetallicPaintedVehicle(myCar);
        System.out.println(myCar);

        myCar=new SatNavVehicle(myCar);
        System.out.println(myCar);
    }
}
