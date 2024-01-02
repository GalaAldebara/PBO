package Tugas1;

public class barier implements destroyable {
    private int strength;

    public barier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        this.strength -= (0.1 * this.strength);
    }

    public String getBarrierInfo() {
        String info = "Barrier Strength = " + this.getStrength();
        return info;
    }
}
