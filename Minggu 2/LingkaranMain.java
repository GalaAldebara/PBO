import java.util.Scanner;

public class LingkaranMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.print("Masukkan Jari-Jari: ");
        r = sc.nextInt();
        Lingkaran lkr = new Lingkaran();

        lkr.HitungKeliling(r);
        lkr.HitungLuas(r);
        lkr.TampilLingkaran();

    }
}
