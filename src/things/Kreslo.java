package things;

import person.Korot;

public class Kreslo implements UseVerevka {
    String name;
    Korot sidit;
    Boolean pr;

    public Kreslo(String na) {
        name = na;
        pr = Boolean.FALSE;
    }

    public void attach(Korot v, Korot k1, Korot k2) {
        if (pr == Boolean.FALSE) {
            sidit = v;
            System.out.println(k1.name +" и " + k2.name + " привязали " + v.name + " к креслу");
            pr = Boolean.TRUE;
        } else {
            System.out.println("кресло занято");
        }
    }

    public void unpin(Verevka v) {
        if (pr == Boolean.TRUE) {
            System.out.println(sidit + " отвязалось от верёвки");
            pr = Boolean.FALSE;
        }
    }

    public void tie(Verevka v) {
        v.spis.add(name);
        System.out.println(name + " привязалось к верёвке");
    }
    public void untie(Verevka v) {
        for (int i =0; i < v.spis.size(); i++) {
            if (v.spis.get(i) == name) {
                v.spis.set(i, "");
            }
        }
        System.out.println(name + " отвязалось от верёвки");
    }
}
