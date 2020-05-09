package eight_1;

public class Sport extends AbstractCar{
    public Sport(Engine engine) {
        super(engine);
    }

    public Sport(Engine engine, Colour colour) {
        super(engine, colour);
    }
    @Override
    public int getPrice() {
        return 8000;
    }
}
