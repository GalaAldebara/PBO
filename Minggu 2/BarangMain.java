public class BarangMain {
    public static void main(String[] args) {
        Barang brg1 = new Barang();

        brg1.kode = "001";
        brg1.namaBarang = "Kompor";
        brg1.hargaDasar = 150000;
        brg1.diskon = 10;
        brg1.hitungHargaJual(150000, 0.1f);
        brg1.tampilData();

    }
}
