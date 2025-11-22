package things;

public class Kreslo_kachalka extends Kreslo {
    public Kreslo_kachalka(String na) {
        super(na);
    }

    public void kachat() {
        if (super.pr == Boolean.TRUE) {
            System.out.println(super.sidit.name + " по качался в кресле");
        } else {
            System.out.println(" никого нет");
        }
    }
}
