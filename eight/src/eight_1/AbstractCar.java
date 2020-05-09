package eight_1;

public abstract class AbstractCar extends AbstractVehicle{

    public AbstractCar(Engine engine) {
        super(engine);
    }

    public AbstractCar(Engine engine, Colour colour) {
        super(engine, colour);
    }
}
