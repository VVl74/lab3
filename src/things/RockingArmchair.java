package things;

public class RockingArmchair extends Armchair {
    public RockingArmchair(String name) {
        super(name);
    }

    public void sway() {
        if (super.isOccupied == Boolean.TRUE) {
            System.out.println(super.sittingInArmchair.name + " по качался в кресле");
        } else {
            System.out.println(" никого нет");
        }
    }
}
