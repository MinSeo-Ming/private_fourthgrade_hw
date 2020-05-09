package eight_1;

public class Coupe extends AbstractCar{

    public Coupe(Engine engine) {
        super(engine);
    }

    public Coupe(Engine engine, Colour colour) {
        super(engine, colour);
    }
    @Override
    public int getPrice() {
        return 7000;
    }
}
