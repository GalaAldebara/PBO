public class Toko {
    public int ID;
    public String Nama;
    public String Game;
    public int Harga;
    public int lamaSewa;
    // public int TampilHarga;

    public void DataHasilPeminjaman() {
        System.out.println("ID          : " + ID);
        System.out.println("Nama        : " + Nama);
        System.out.println("Game        : " + Game);
        System.out.println("Harga       : " + Harga);
    }

    public int TampilHarga(int lamaSewa, int harga) {
        int TampilHarga = lamaSewa * harga;
        return TampilHarga;
    }
}
