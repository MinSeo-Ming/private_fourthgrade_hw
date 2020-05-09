package CAR;
public abstract class AbstractCar extends AbstractVehicle {
    GearboxStrategy gearboxStrategy;

    public AbstractCar(Engine engine){
        super (engine);
        gearboxStrategy =new StandardGearboxStrategy();// 클래스 인스턴스 생성
    }

    public AbstractCar(Engine engine,Vehicle.Colour colour){
        super(engine,colour);
        gearboxStrategy =new StandardGearboxStrategy();// 클래스 인스턴스 생성
    }

    public void setGearboxStrategy(GearboxStrategy gs){ this.gearboxStrategy =gs; }
    public GearboxStrategy getGearboxStrategy(){ return this.gearboxStrategy; }
    public  void setSpeed(int speed){ gearboxStrategy.ensureCorrectGear(getEngine(),speed); }


}
