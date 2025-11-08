package Neznai;

public class Cosmonaft extends Korot implements UseVerevka {
    private Scafandr scaf;
    public Cosmonaft(String name, Scafandr a) {
        super(name);
        scaf = a;
    }

    public void privaz(Verevka v) {
        v.spis.add(super.name);
        System.out.println(super.name + " привязал себя к верёвке");
    }
    public void otvyaz(Verevka v) {
        for (int i =0; i < v.spis.size(); i++) {
            if (v.spis.get(i) == super.name) {
                v.spis.set(i, "");
            }
        }
        System.out.println(super.name + " отвязал себя от верёвки");
    }

    public void flight() {
        if (scaf.germo.pr == Boolean.TRUE) {
            System.out.println(super.name + " взлетел");
        } else {
            System.out.println("у " + super.name + "нет пропеллера");
        }
    }

    public void parashut() {
        if (scaf.germo.pr == Boolean.TRUE) {
            System.out.println(super.name + " раскрыл парашут");
        } else {
            System.out.println("у " + super.name + " нет парашута");
        }
    }
}
