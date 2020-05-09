package eight_1;

public abstract class AbstractVehicle implements Vehicle {
    private Engine engine;
    private Vehicle.Colour colour;

    public AbstractVehicle(Engine engine){
        this(engine, Vehicle.Colour.UNPAINTED);
    }
    public AbstractVehicle(Engine engine,Vehicle.Colour colour){
        this.engine =engine;
        this.colour =colour;
    }
    public Engine getEngine(){
        return engine;
    }
    public Vehicle.Colour getColour(){
        return colour;
    }

    public void paint(Colour colour) {
        this.colour =colour;
    }
    public String toString(){
        return getClass().getSimpleName() +
                " (" + engine + ", "+colour +", price "+getPrice()+")";
    }

    public int getPrice() {
        return 0;
    }
}
