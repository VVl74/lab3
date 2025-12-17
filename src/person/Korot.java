package person;

import planet.Planet;

public abstract class Korot {
    final public String name;
    public boolean alive;
    public Planet planet;
    final public int strong;

    public  Korot(String newName, int newStrong) {
        name = newName;
        alive = Boolean.TRUE;
        strong = newStrong;
    }

    public void addPlanet(Planet newPlanet) {
        planet = newPlanet;
    }

    public void chekPlanet() {
        System.out.println(name + " на планете " + planet.name);
    }

    public Boolean chekSost() {
        return alive;
    }

    public void fallOut() {
        System.out.println(name + " вывалился");
    }
}
