package eight_1;

public class AlloyWheeledVehicle extends AbstractVehicleOption{
    Vehicle vehicle;;

    public AlloyWheeledVehicle(Vehicle vehicle) {
        super(vehicle);
        this.vehicle = vehicle;
    }
    @Override
    public int getPrice() {
        return vehicle.getPrice() + 250;
    }
}
