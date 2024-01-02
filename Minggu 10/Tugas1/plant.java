package Tugas1;

public class plant {
    public void doDestroy(destroyable d) {
        if (d instanceof jumpingZombie) {
            jumpingZombie jz = (jumpingZombie) d;
            jz.destroyed();
            jz.heal();
        } else if (d instanceof walkingZombie) {
            walkingZombie wz = (walkingZombie) d;
            wz.destroyed();
            wz.heal();
        } else {
            barier b = (barier) d;
            b.destroyed();
        }
    }
}
