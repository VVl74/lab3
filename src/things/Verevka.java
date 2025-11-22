package things;

import java.util.ArrayList;
import java.util.List;

public class Verevka {
    String material;

    public List<String> spis = new ArrayList<>();

    public Verevka(String a) {
        material = a;
    }

    public void get_all() {
        for(int i =0; i < spis.size(); i++) {
            System.out.println(spis.get(i) + " привязан к шнуру");
        }
    }
}

