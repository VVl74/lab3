package person;

public class SpaceSuit extends Suit {
    final public PressureHelmet germoHelmet;

    public SpaceSuit(String name, PressureHelmet newPressureHelmet) {
        super(name);
        germoHelmet = newPressureHelmet;
    }
}
