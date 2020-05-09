package eight_1;

public abstract class AbstractVehicleOption extends AbstractVehicle {


    public AbstractVehicleOption(Vehicle vehicle){
        super(vehicle.getEngine(),vehicle.getColour());
    }



    public abstract int getPrice();
}
