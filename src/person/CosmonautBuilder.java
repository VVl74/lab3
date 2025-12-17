package person;

public class CosmonautBuilder {
    private static int cosmCounter = 1;

    public static Cosmonaut create(String name, int strong, boolean hasPropeller) {
        PressureHelmet helmet = new PressureHelmet(false);

        if (hasPropeller) {
            Propeller prop = new Propeller(4);
            helmet.setProp(prop);
        }

        SpaceSuit spacesuit = new SpaceSuit("suit mk" + cosmCounter, helmet);

        cosmCounter++;
        return new Cosmonaut(name, spacesuit, strong);
    }
}
