import java.util.Scanner;

public class PersegiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int sisi;
        // System.out.println("Masukkan Sisi");
        // sisi = sc.nextInt();
        Persegi psg = new Persegi();

        psg.TampilSisi(4);
        psg.HitungKeliling(6);
        psg.HitungLuas(4);
        psg.cetakMethod();

    }
}
