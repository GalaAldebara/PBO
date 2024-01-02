package Tugas1;

public class main {
    public static void main(String[] args) {
        walkingZombie wz = new walkingZombie(100, 1);
        jumpingZombie jz = new jumpingZombie(100, 2);
        barier b = new barier(100);
        plant p = new plant();

        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());

        System.out.println("\n---------------------------\n");

        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }

        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
    }
}
