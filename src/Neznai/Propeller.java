package Neznai;

public class Propeller {
    Boolean vkl;
    int lopast;
    String skor = "";

    public Propeller(boolean a) {
        vkl = a;
        lopast = 4;
    }

    public void flight(Korot a) {
        System.out.println(a.name + " взлетел");
    }

    public void parashut(Korot a) {
        System.out.println(a.name + " использовал парашут");
    }
}
