package planet;

public class Planet extends SpaceObject {
    final public int radius;
    public Planet(String name, int newRadius) {
        super(name);
        radius = newRadius;
    }
}
