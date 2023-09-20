import java.util.Scanner;

public class TokoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Toko tk1 = new Toko();
        tk1.ID = 001;
        tk1.Nama = "Muhammad Reynald Silva";
        tk1.Game = "Shadow Of The TombRider";
        tk1.Harga = 15000;
        tk1.lamaSewa = 4;
        tk1.DataHasilPeminjaman();

        tk1.TampilHarga(7, 15000);
        System.out.println("Total Pembayaran: " + tk1.TampilHarga(tk1.Harga, tk1.lamaSewa));
    }
}
