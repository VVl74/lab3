package person;

import myInterface.*;
import things.*;

public class Cosmonaut extends Korot implements Ropeable, UseVector, Flyable, Parachutable {
    private SpaceSuit spaceSuit;
    public Vector coordinate = new Vector(0, 0, 0, 0);
    public Boolean flight;
    public String currentCommand;
    public String commander;

    public Cosmonaut(String name, SpaceSuit newScaf, int strong) {
        super(name, strong);
        spaceSuit = newScaf;
        flight = Boolean.FALSE;
    }

    public void fall() {
        if (coordinate.z > super.strong) {
            if (spaceSuit.germoHelmet.hasPropeller == Boolean.TRUE) {
                parashut();
            } else {
                super.alive = Boolean.FALSE;
                System.out.println(name + " разбился");
                spaceSuit.germoHelmet.tightness = Boolean.FALSE;
            }
        } else {
            coordinate.z = 0;
            coordinate.speed_z = 0;
            System.out.println(name + " упал");
        }
    }

    public int getX() {
        return coordinate.x;
    }
    public int getY() {
        return coordinate.y;
    }
    public int getZ() {
        return coordinate.z;
    }
    public int getSpeedZ() {
        return coordinate.speed_z;
    }

    public void getCord() {
        System.out.println(name + " находися в точке " + coordinate.x +" "+  coordinate.y +" "+ coordinate.z + " скорость падения " + coordinate.speed_z);
    }

    public void getComander() {
        System.out.println(name + " под командованием " + commander + " текущий приказ " + currentCommand);
    }

    public CosmonautStatus isOnAir() {
        boolean onAir = coordinate.z > 0;
        boolean alive = super.chekSost(); // true = жив, false = мертв

        if (onAir && alive) {
            return CosmonautStatus.AIR_ALIVE;
        }
        if (onAir && !alive) {
            return CosmonautStatus.AIR_DEAD;
        }
        if (!onAir && alive) {
            return CosmonautStatus.GROUND_ALIVE;
        }
        return CosmonautStatus.GROUND_DEAD;
    }

    public void tie(Rope rope) {
        rope.attach(super.name);
        System.out.println(super.name + " привязал себя к верёвке");
    }
    public void untie(Rope rope) {
        rope.detach(super.name);
        System.out.println(super.name + " отвязал себя от верёвки");
    }

    public void flight(Vector currentVector) {
        if (chekSost() == Boolean.FALSE) {
            System.out.println(super.name + " разбился");
            return;
        }

        if (spaceSuit.germoHelmet.hasPropeller == Boolean.TRUE) {
            spaceSuit.germoHelmet.propeller.speed = "normal";
            flight = Boolean.TRUE;
            System.out.println(super.name + " взлетел");
            coordinate.z = coordinate.z + currentVector.z;
            coordinate.x = coordinate.x + currentVector.x;
            coordinate.y = coordinate.y + currentVector.y;
            coordinate.speed_z = coordinate.speed_z + currentVector.speed_z;

        } else {
            System.out.println("у " + super.name + "нет пропеллера");
            return;
        }

        if (coordinate.z <= 0 && coordinate.speed_z < 0) {
            System.out.println(super.name + " разбился");
            super.alive = Boolean.FALSE;
            spaceSuit.germoHelmet.tightness = Boolean.FALSE;
        }
        if (coordinate.z <= 0 && coordinate.speed_z == 0) {
            coordinate.z=0;
        }
    }

    public void parashut() {
        if (chekSost() == Boolean.FALSE) {
            System.out.println(super.name + " разбился");
            return;
        }
        if (spaceSuit.germoHelmet.hasPropeller == Boolean.TRUE) {
            spaceSuit.germoHelmet.propeller.speed = "fast";
            System.out.println(super.name + " раскрыл парашут");
            coordinate.speed_z = 0;
        } else {
            System.out.println("у " + super.name + " нет парашута");
        }
    }
}
