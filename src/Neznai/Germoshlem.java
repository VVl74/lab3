package Neznai;

public class Germoshlem {
    public Boolean germet;
    public Propeller propl;
    Boolean pr = Boolean.FALSE;

    public void setprop(Propeller p1) {
        pr = Boolean.TRUE;
        propl = p1;
        System.out.println("у гермошлема теперь есть пропеллер");
    }

    public Germoshlem(boolean a) {
        germet = a;
    }
}
