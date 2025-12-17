package things;

public class Vector {
    public int x;
    public int y;
    public int z;
    public int speed_z;

    public Vector(int xp, int yp, int zp, int newSpeedZ) {
        speed_z = newSpeedZ;
        x = xp;
        y = yp;
        z = zp;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }
    public int getSpeedZ() {
        return speed_z;
    }
}
