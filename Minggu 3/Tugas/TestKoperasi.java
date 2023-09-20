import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nomor KTP: ");
        String nomorKTP = scanner.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Limit Pinjaman: ");
        int limitPinjaman = scanner.nextInt();

        Anggota donny = new Anggota(nomorKTP, nama, limitPinjaman);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.println("\nMeminjam uang...");
        System.out.print("Masukkan jumlah pinjaman: ");
        int jumlahPinjaman = scanner.nextInt();
        donny.pinjam(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran...");
        System.out.print("Masukkan jumlah angsuran: ");
        int jumlahAngsuran = scanner.nextInt();
        donny.angsur(jumlahAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        scanner.close();
    }
}
