import person.*;
import things.*;
import planet.Planet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Germoshlem germo1 = new Germoshlem(Boolean.FALSE);
        Scafandr scaf1 = new Scafandr("skaf mk1", germo1);

        Cosmonaft neznaika = new Cosmonaft("Neznaika", scaf1);

        Propeller p2 = new Propeller(4);
        Germoshlem germo2 = new Germoshlem(Boolean.FALSE);
        germo2.setprop(p2);

        Scafandr scaf2 = new Scafandr("skaf mk2", germo2);

        Commander znaika = new Commander("Znaika", scaf2);

        Planet Luna = new Planet("Luna", 123);

        znaika.addPlanet(Luna);

        Propeller p3 = new Propeller(4);
        Germoshlem germo3 = new Germoshlem(Boolean.FALSE);
        germo2.setprop(p3);

        Scafandr scaf3 = new Scafandr("skaf mk2", germo3);

        Cosmonaft Kantik = new Cosmonaft("Kantik", scaf3);

        Germoshlem germo4 = new Germoshlem(Boolean.FALSE);

        Scafandr scaf4 = new Scafandr("skaf mk2", germo4);

        Cosmonaft ponchik = new Cosmonaft("Ponchik", scaf4);


        Propeller p5 = new Propeller(4);
        Germoshlem germo5 = new Germoshlem(Boolean.FALSE);
        germo5.setprop(p5);

        Scafandr scaf5 = new Scafandr("skaf mk2", germo5);

        Cosmonaft kvantik = new Cosmonaft("Kvantik", scaf5);

        Verevka verevk = new Verevka("Капрон");

        Kreslo_kachalka kreslo = new Kreslo_kachalka("Кресло-качалка");

        znaika.newPodch(Kantik);
        znaika.newPodch(kvantik);
        znaika.newPodch(ponchik);

        kreslo.attach(neznaika, Kantik, kvantik);
        kreslo.tie(verevk);

        znaika.prikaz("tie", verevk);

        Kantik.getComander();

        znaika.tie(verevk);

        kreslo.kachat();


        Vector v1 = new Vector(10, 10, 12, 10);

        znaika.prikaz("flight", v1);

        znaika.flight(v1);

        // Vector v2 = new Vector(-10, -10, 0, 10);

        neznaika.vyvalitsa();
        neznaika.parashut();
        neznaika.fall();

        kreslo.unpin(verevk);

        kvantik.fall();

        znaika.parashut();

        verevk.getAll();

        znaika.getCord();

        znaika.isOnAir();

        kvantik.untie(verevk);

        Vector v3 = new Vector(0, 0, -20, -20);
        kvantik.flight(v3);
        scaf5.germo.chekGermet();

        kreslo.untie(verevk);

        neznaika.prSost();

        znaika.chekPlanet();


        // Verevka v1
        // cosm1.privyazat(v1)
        // Koorot neznayka
        // Kreslo kr1
        // kr1.privyazat(v1)
    }
}