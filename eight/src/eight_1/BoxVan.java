package eight_1;

public class BoxVan extends  AbstractVan{
    public BoxVan(Engine engine) {
        super(engine);
    }

    public BoxVan(Engine engine, Colour colour) {
        super(engine, colour);
    }

    @Override
    public int getPrice() {
        return 10000;
    }
}
