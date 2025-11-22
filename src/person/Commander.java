package person;

import things.Vector;
import things.Verevka;

import java.util.ArrayList;
import java.util.List;

public class Commander extends Cosmonaft {
    List<Cosmonaft> podch = new ArrayList<>();
    String curpr = "";

    public Commander(String name, Scafandr a) {
        super(name, a);
    }

    public void new_podch(Cosmonaft pr) {
        pr.Com = super.name;
        podch.add(pr);
    }

    public void prikaz(String text, Object arg) {
        System.out.println(super.name + " приказал " + text);
        curpr = text;
        for (int i =0; i < podch.size(); i++) {
            podch.get(i).curpr = text;
            if (text == "tie") {
                podch.get(i).tie((Verevka) arg);
            }
            if (text == "flight") {
                podch.get(i).flight((Vector) arg);
            }
        }
    }
}
