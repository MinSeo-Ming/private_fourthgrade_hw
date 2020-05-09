public interface Vehicle {
    public enum Colour{UNPAINTED, BLUE,BLACK, GREEN,RED,SILVER,WHITE,YELLOW}

    public Engine getEngine();
    public Vehicle.Colour getColour();// color getter
    public void paint(Vehicle.Colour colour);// paint a car

}
