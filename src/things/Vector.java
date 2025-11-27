package things;

public class Vector {
    public int x;
    public int y;
    public int z;
    public int speed_z;

    public Vector(int xp, int yp, int zp, int spz) {
        speed_z = spz;
        x = xp;
        y = yp;
        z = zp;
    }
}
