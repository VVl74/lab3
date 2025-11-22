package person;

public class Propeller {
    int lopast;
    String skor = "";

    public Propeller(int a) {
        lopast = a;
    }

    public void flight(Korot a) {
        System.out.println(a.name + " взлетел");
    }

    public void parashut(Korot a) {
        System.out.println(a.name + " использовал парашут");
    }
}
