package person;

import things.*;

public class Cosmonaft extends Korot implements UseVerevka {
    private Scafandr scaf;
    public Vector kord = new Vector(0, 0, 0, 0);
    public Boolean polet;
    public String curpr;
    public String Com;

    public Cosmonaft(String name, Scafandr a) {
        super(name);
        scaf = a;
        polet = Boolean.FALSE;
        kord.x = 0;
        kord.y = 0;
        kord.z = 0;
        kord.speed_z = 0;
    }

    public void fall() {
        if (kord.z > 10) {
            if (scaf.germo.pr == Boolean.TRUE) {
                parashut();
            } else {
                super.sost = Boolean.FALSE;
                System.out.println(name + " разбился");
                scaf.germo.germet = Boolean.FALSE;
            }
        } else {
            kord.z = 0;
            kord.speed_z = 0;
            System.out.println(name + " упал");
        }
    }

    public void getCord() {
        System.out.println(name + " находися в точке " + kord.x +" "+  kord.y +" "+ kord.z + " скорость падения " + kord.speed_z);
    }

    public void getComander() {
        System.out.println(name + " под командованием " + Com + " текущий приказ " + curpr);
    }

    public void isOnAir() {
        if (prSost() == 0) {
            System.out.println(super.name + " разбился");
            return;
        }
        if (kord.z > 0) {
            System.out.println(super.name + " в воздухе");
        } else {
            System.out.println(super.name + " на земле");
        }
    }

    public void tie(Verevka vv) {
        if (prSost() == 0) {
            System.out.println(super.name + " разбился");
            return;
        }
        vv.spis.add(super.name);
        System.out.println(super.name + " привязал себя к верёвке");
    }
    public void untie(Verevka vv) {
        if (prSost() == 0) {
            System.out.println(super.name + " разбился");
            return;
        }
        for (int i =0; i < vv.spis.size(); i++) {
            if (vv.spis.get(i) == super.name) {
                vv.spis.set(i, "");
            }
        }
        System.out.println(super.name + " отвязал себя от верёвки");
    }

    public void flight(Vector vec) {
        if (prSost() == 0) {
            System.out.println(super.name + " разбился");
            return;
        }

        if (scaf.germo.pr == Boolean.TRUE) {
            scaf.germo.propl.skor = "Sredn";
            polet = Boolean.TRUE;
            System.out.println(super.name + " взлетел");
            kord.z = kord.z + vec.z;
            kord.x = kord.x + vec.x;
            kord.y = kord.y + vec.y;
            kord.speed_z = kord.speed_z + vec.speed_z;

        } else {
            System.out.println("у " + super.name + "нет пропеллера");
        }

        if (kord.z <= 0 && kord.speed_z < 0) {
            System.out.println(super.name + " разбился");
            super.sost = Boolean.FALSE;
            scaf.germo.germet = Boolean.FALSE;
        }
        if (kord.z <= 0 && kord.speed_z == 0) {
            kord.z=0;
        }
    }

    public void parashut() {
        if (prSost() == 0) {
            System.out.println(super.name + " разбился");
            return;
        }
        if (scaf.germo.pr == Boolean.TRUE) {
            scaf.germo.propl.skor = "Visok";
            System.out.println(super.name + " раскрыл парашут");
            kord.speed_z = 0;

        } else {
            System.out.println("у " + super.name + " нет парашута");
        }
    }
}
