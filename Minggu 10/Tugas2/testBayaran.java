package Tugas2;

public class testBayaran {
    public static void main(String[] args) {
        manajer manager = new manajer("Agus", 800, 50);
        programer programmer = new programer("Budi", 600, 30);
        bayaran bayaran = new bayaran();

        System.out.println("Bayaran Manager : " + bayaran.hitungBayaran(manager));
        System.out.println("Bayaran Programmer : " + bayaran.hitungBayaran(programmer));
    }
}
