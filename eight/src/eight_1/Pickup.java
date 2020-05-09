package eight_1;

public class Pickup extends AbstractVan{
    public Pickup(Engine engine) {
        super(engine);
    }

    public Pickup(Engine engine, Colour colour) {
        super(engine, colour);
    }
    @Override
    public int getPrice() {
        return 9000;
    }
}
