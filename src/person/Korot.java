package person;

import planet.Planet;

public class Korot {
    public String name;
    boolean sost;
    public Planet planet;

    public  Korot(String a) {
        name = a;
        sost = Boolean.TRUE;
    }

    public void addPlanet(Planet a) {
        planet = a;
    }

    public void chekPlanet() {
        System.out.println(name + " на планете " + planet.name);
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
