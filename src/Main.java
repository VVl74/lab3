import person.*;
import things.*;
import planet.Planet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        PressureHelmet germo1 = new PressureHelmet(Boolean.FALSE);
        SpaceSuit spacesuit1 = new SpaceSuit("skaf mk1", germo1);

        Cosmonaut neznaika = new Cosmonaut("Neznaika", spacesuit1, 5);

        Propeller propeller2 = new Propeller(4);
        PressureHelmet germo2 = new PressureHelmet(Boolean.FALSE);
        germo2.setProp(propeller2);

        SpaceSuit spacesuit2 = new SpaceSuit("skaf mk2", germo2);

        Commander znaika = new Commander("Znaika", spacesuit2, 10);

        Planet luna = new Planet("Luna", 123);

        znaika.addPlanet(luna);

        Propeller propeller3 = new Propeller(4);
        PressureHelmet germo3 = new PressureHelmet(Boolean.FALSE);
        germo2.setProp(propeller3);

        SpaceSuit spacesuit3 = new SpaceSuit("skaf mk2", germo3);

        Cosmonaut kantik = new Cosmonaut("Kantik", spacesuit3, 7);

        PressureHelmet germo4 = new PressureHelmet(Boolean.FALSE);

        SpaceSuit spacesuit4 = new SpaceSuit("skaf mk2", germo4);

        Cosmonaut ponchik = new Cosmonaut("Ponchik", spacesuit4, 3);


        Propeller propeller5 = new Propeller(4);
        PressureHelmet germo5 = new PressureHelmet(Boolean.FALSE);
        germo5.setProp(propeller5);

        SpaceSuit spacesuit5 = new SpaceSuit("skaf mk2", germo5);

        Cosmonaut kvantik = new Cosmonaut("Kvantik", spacesuit5, 10);

        SimpleRope simpleRope = new SimpleRope("Капрон");

        RockingArmchair kreslo = new RockingArmchair("Кресло-качалка");

        znaika.newSubordinate(kantik);
        znaika.newSubordinate(kvantik);
        znaika.newSubordinate(ponchik);

        kreslo.attach(neznaika, kantik, kvantik);
        kreslo.tie(simpleRope);

        znaika.order("tie", simpleRope);

        kantik.getComander();

        znaika.tie(simpleRope);

        kreslo.sway();

        Vector v1 = new Vector(10, 10, 12, 10);

        znaika.order("flight", v1);

        znaika.flight(v1);

        // Vector v2 = new Vector(-10, -10, 0, 10);

        neznaika.fallOut();
        neznaika.parashut();
        neznaika.fall();

        kreslo.untie(simpleRope);

        kvantik.fall();

        znaika.parashut();

        simpleRope.getAll();

        znaika.getCord();

        CosmonautStatus st = znaika.isOnAir();

        switch (st) {
            case AIR_ALIVE:
                System.out.println("в воздухе жив");
                break;

            case AIR_DEAD:
                System.out.println("в воздухе мертв");
                break;

            case GROUND_ALIVE:
                System.out.println("на земле жив");
                break;

            case GROUND_DEAD:
                System.out.println("на земле мертв");
                break;
        }

        kvantik.untie(simpleRope);

        Vector v3 = new Vector(0, 0, -20, -20);
        kvantik.flight(v3);
        spacesuit5.germoHelmet.chekTightness();

        kreslo.untie(simpleRope);

        neznaika.chekSost();

        znaika.chekPlanet();

        Cosmonaut vintik = CosmonautBuilder.create("vintik", 20, Boolean.TRUE);

        vintik.tie(simpleRope);
    }
}