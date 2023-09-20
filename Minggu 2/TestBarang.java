public class TestBarang {
    public static void main(String[] args) {
        Percobaan3 brg1 = new Percobaan3();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();

        System.out.println("Stok Baru adalah " + brg1.tambahStok(20));
    }
}
