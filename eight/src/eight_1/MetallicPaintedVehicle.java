package eight_1;

public class MetallicPaintedVehicle extends AbstractVehicleOption{
    Vehicle vehicle;;

    public MetallicPaintedVehicle(Vehicle vehicle) {
        super(vehicle);
        this.vehicle = vehicle;
    }
    @Override
    public int getPrice() {
        return vehicle.getPrice() + 750;
    }
}
