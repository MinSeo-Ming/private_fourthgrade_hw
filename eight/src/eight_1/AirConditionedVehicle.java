package eight_1;

public class AirConditionedVehicle extends AbstractVehicleOption {
    Vehicle vehicle;
    int temperature;

    public AirConditionedVehicle(Vehicle vehicle) {
        super(vehicle);
        this.vehicle = vehicle;
    }

    public void setTemperature(int temperature) {

        this.temperature = temperature;
    }

    @Override
    public int getPrice() {
        return vehicle.getPrice() + 600;
    }

}
