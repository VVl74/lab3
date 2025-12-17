package person;

public class PressureHelmet {
    public Boolean tightness;
    public Propeller propeller;
    public Boolean hasPropeller = Boolean.FALSE;

    public void setProp(Propeller newPropeller) {
        hasPropeller = Boolean.TRUE;
        propeller = newPropeller;
        System.out.println("у гермошлема теперь есть пропеллер");
    }

    public void chekTightness() {
        if (tightness) {
            System.out.println("шлем герметичен");
        } else {
            System.out.println("шлем не герметичен");
        }
    }

    public PressureHelmet(boolean a) {
        tightness = a;
    }
}
