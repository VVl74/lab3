package Neznai;

public class Propeller {
    Boolean vkl;
    public Propeller(boolean a) {
        vkl = a;
    }

    public void flight(Korot a) {
        System.out.println(a.name + " взлетел");
    }

    public void parashut(Korot a) {
        System.out.println(a.name + " использовал парашут");
    }
}
