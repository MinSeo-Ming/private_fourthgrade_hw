package eight_1;

public class SatNavVehicle extends AbstractVehicleOption{
    Vehicle vehicle;;
    String destination;

    public SatNavVehicle(Vehicle vehicle) {
        super(vehicle);
        this.vehicle = vehicle;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public int getPrice() {
        return vehicle.getPrice() + 1500;
    }
}
