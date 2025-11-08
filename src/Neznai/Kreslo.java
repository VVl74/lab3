package Neznai;

import java.util.TreeMap;

public class Kreslo implements UseVerevka {
    String name;
    Korot sidit;
    Boolean pr;

    public Kreslo(String na) {
        name = na;
        pr = Boolean.FALSE;
    }

    public void prikrep(Korot v, Korot k1, Korot k2) {
        if (pr == Boolean.FALSE) {
            sidit = v;
            System.out.println(k1.name +" и " + k2.name + " привязали " + v.name + " к креслу");
            pr = Boolean.TRUE;
        } else {
            System.out.println("кресло занято");
        }
    }

    public void otkrep(Verevka v) {
        if (pr == Boolean.TRUE) {
            System.out.println(sidit + " отвязалось от верёвки");
            pr = Boolean.FALSE;
        }
    }

    public void privaz(Verevka v) {
        v.spis.add(name);
        System.out.println(name + " привязалось к верёвке");
    }
    public void otvyaz(Verevka v) {
        for (int i =0; i < v.spis.size(); i++) {
            if (v.spis.get(i) == name) {
                v.spis.set(i, "");
            }
        }
        System.out.println(name + " отвязалось от верёвки");
    }
}
