package CAR;
public abstract class AbstractVehicle implements Vehicle {
    private Engine engine; //engine reference
    private Vehicle.Colour colour; //colour reference

    public AbstractVehicle(Engine engine){ this.engine =engine; }
    public AbstractVehicle(Engine engine, Vehicle.Colour colour){
        this.engine =engine;
        this.colour= colour;
    }

    public Engine getEngine() { return this.engine; }//engine getter
    public Vehicle.Colour getColour(){ return this.colour; } //color getter

    @Override
    public void paint(Vehicle.Colour colour) { this.colour =colour; }
}
