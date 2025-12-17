package things;

import myInterface.Rope;

import java.util.ArrayList;
import java.util.List;

public class SimpleRope implements Rope {
    final private String material;

    final private List<String> listOfLinked = new ArrayList<>();

    public SimpleRope(String newMaterial)
    {
        material = newMaterial;
    }

    @Override
    public void attach(String name) {
        listOfLinked.add(name);
    }
    public void detach(String name) {
        listOfLinked.remove(name);
    }

    public void getAll() {
        for(int i = 0; i < listOfLinked.size(); i++) {
            System.out.println(listOfLinked.get(i) + " привязан к шнуру");
        }
    }
}

