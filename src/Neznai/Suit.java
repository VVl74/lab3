package Neznai;

public class Suit {
    String name;

    public Suit(String nm) {
        name = nm;
    }

    public void puton(Korot a) {
        System.out.println(a.name + "одел костюм");
    }
}
