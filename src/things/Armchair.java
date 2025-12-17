package things;

import myInterface.Rope;
import myInterface.Ropeable;
import person.Korot;

public class Armchair implements Ropeable {
    public final String name;
    public Korot sittingInArmchair;
    public Boolean isOccupied;

    public Armchair(String newName) {
        name = newName;
        isOccupied = Boolean.FALSE;
    }

    public void attach(Korot sitting, Korot binder1, Korot binder2) {
        if (isOccupied == Boolean.FALSE) {
            sittingInArmchair = sitting;
            System.out.println(binder1.name +" и " + binder2.name + " привязали " + sitting.name + " к креслу");
            isOccupied = Boolean.TRUE;
        } else {
            System.out.println("кресло занято");
        }
    }

    public void tie(Rope rope) {
        rope.attach(name);
        System.out.println(name + " привязалось к верёвке");
    }
    public void untie(Rope rope) {
        rope.detach(name);
        System.out.println(name + " отвязалось от верёвки");
    }
}
