package person;

public class Germoshlem {
    public Boolean germet;
    public Propeller propl;
    public Boolean pr = Boolean.FALSE;

    public void setprop(Propeller p1) {
        pr = Boolean.TRUE;
        propl = p1;
        System.out.println("у гермошлема теперь есть пропеллер");
    }

    public void chekGermet() {
        if (germet) {
            System.out.println("шлем герметичен");
        } else {
            System.out.println("шлем не герметичен");
        }
    }

    public Germoshlem(boolean a) {
        germet = a;
    }
}
