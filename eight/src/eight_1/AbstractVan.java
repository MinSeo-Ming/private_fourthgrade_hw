package eight_1;

public abstract class AbstractVan extends AbstractVehicle{

    public AbstractVan(Engine engine) {
        super(engine);
    }

    public AbstractVan(Engine engine, Colour colour) {
        super(engine, colour);
    }
}
