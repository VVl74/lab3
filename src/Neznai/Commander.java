package Neznai;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Commander extends Cosmonaft {
    List<Cosmonaft> podch = new ArrayList<>();
    String curpr = "";

    public Commander(String name, Scafandr a) {
        super(name, a);
    }

    public void ncom(Cosmonaft pr) {
        pr.Com = super.name;
        podch.add(pr);
    }

    public void Prikaz(String text, Object arg) {
        curpr = text;
        for (int i =0; i < podch.size(); i++) {
            podch.get(i).curpr = text;
            if (text == "privyaz") {
                podch.get(i).privaz((Verevka) arg);
            }
            if (text == "polet") {
                podch.get(i).flight((Vector) arg);
            }
        }
        System.out.println(super.name + " приказал " + text);
    }
}
