import java.util.Scanner;

public class PersegiNyoba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Sisi: ");
        int sisi = sc.nextInt();

        int hitungLuas = sisi * sisi;
        int hitungKeliling = sisi * 4;

        System.out.println("Luas Sisi   : " + hitungLuas);
        System.out.println("Keliling Sisi:  " + hitungKeliling);
    }

}
