package eight_1;

public class Saloon extends AbstractCar{
    public Saloon(Engine engine) {
        super(engine);
    }

    public Saloon(Engine engine, Colour colour) {
        super(engine, colour);
    }
    @Override
    public int getPrice() {
        return 6000;
    }
}
