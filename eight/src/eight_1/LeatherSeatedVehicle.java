package eight_1;

public class LeatherSeatedVehicle extends  AbstractVehicleOption{
    Vehicle vehicle;;

    public LeatherSeatedVehicle(Vehicle vehicle) {
        super(vehicle);
        this.vehicle = vehicle;
    }
    @Override
    public int getPrice() {
        return vehicle.getPrice() + 1200;
    }
}
