package person;

import things.Vector;
import things.SimpleRope;

import java.util.ArrayList;
import java.util.List;

final public class Commander extends Cosmonaut {
    private final List<Cosmonaut> subordinates = new ArrayList<>();
    private String currentCommand = "";

    public Commander(String name, SpaceSuit newScaf, int strong) {
        super(name, newScaf, strong);
    }

    public void newSubordinate(Cosmonaut newSubordinate) {
        newSubordinate.commander = super.name;
        subordinates.add(newSubordinate);
    }

    public void order(String method, Object data) {
        System.out.println(super.name + " приказал " + method);
        currentCommand = method;
        for (int i = 0; i < subordinates.size(); i++) {
            subordinates.get(i).currentCommand = method;
            if (method == "tie") {
                subordinates.get(i).tie((SimpleRope) data);
            }
            if (method == "flight") {
                subordinates.get(i).flight((Vector) data);
            }
        }
    }
}
