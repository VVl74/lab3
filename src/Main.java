import Neznai.Cosmonaft;
import Neznai.Germoshlem;
import Neznai.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Germoshlem germo1 = new Germoshlem(Boolean.FALSE);
        Scafandr scaf1 = new Scafandr("skaf mk1", germo1);

        Cosmonaft Neznaika = new Cosmonaft("Neznaika", scaf1);

        Propeller p2 = new Propeller(Boolean.FALSE);
        Germoshlem germo2 = new Germoshlem(Boolean.FALSE);
        germo2.setprop(p2);

        Scafandr scaf2 = new Scafandr("skaf mk2", germo2);

        Commander Znaika = new Commander("Znaika", scaf2);

        Propeller p3 = new Propeller(Boolean.FALSE);
        Germoshlem germo3 = new Germoshlem(Boolean.FALSE);
        germo2.setprop(p3);

        Scafandr scaf3 = new Scafandr("skaf mk2", germo2);

        Cosmonaft Kantik = new Cosmonaft("Kantik", scaf3);

        Germoshlem germo4 = new Germoshlem(Boolean.FALSE);

        Scafandr scaf4 = new Scafandr("skaf mk2", germo4);

        Cosmonaft Ponchik = new Cosmonaft("Ponchik", scaf4);


        Propeller p5 = new Propeller(Boolean.FALSE);
        Germoshlem germo5 = new Germoshlem(Boolean.FALSE);
        germo5.setprop(p5);

        Scafandr scaf5 = new Scafandr("skaf mk2", germo5);

        Cosmonaft Kvantik = new Cosmonaft("Kvantik", scaf5);

        Verevka verevk = new Verevka("Капрон");

        Kreslo_kachalka kreslo = new Kreslo_kachalka("Кресло-качалка");

        Znaika.ncom(Kantik);
        Znaika.ncom(Kvantik);
        Znaika.ncom(Ponchik);

        kreslo.prikrep(Neznaika, Kantik, Kvantik);
        kreslo.privaz(verevk);

        Znaika.Prikaz("privyaz", verevk);

        Kantik.getcom();

        Znaika.privaz(verevk);

        kreslo.kachat();


        Vector v1 = new Vector(10, 10, 12, 10);

        Znaika.Prikaz("polet", v1);

        Znaika.flight(v1);

        Vector v2 = new Vector(-10, -10, 0, 10);

        Neznaika.vyvalitsa();
        Neznaika.parashut();
        Neznaika.padat();

        Kvantik.padat();

        Znaika.parashut();

        verevk.Get_all();


        // Verevka v1
        // cosm1.privyazat(v1)
        // Koorot neznayka
        // Kreslo kr1
        // kr1.privyazat(v1)
    }
}