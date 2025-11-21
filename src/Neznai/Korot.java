package Neznai;

public class Korot {
    String name;
    String polog_tela;
    boolean sost;

    public  Korot(String a) {
        name = a;
        sost = Boolean.TRUE;
    }

    public int prSost() {
        if (sost == Boolean.FALSE) {
            System.out.println(name + " разбился");
            return 0;
        } else {
            return 1;
        }
    }

    public void vyvalitsa() {
        System.out.println(name + " вывалился");
    }
}
