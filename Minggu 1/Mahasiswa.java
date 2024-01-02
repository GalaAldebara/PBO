import java.util.Scanner;

public class Mahasiswa {

    Mahasiswa mhs = new Mahasiswa();

    public int nim;
    public String nama;
    public String alamat;
    public String noTelp;

    public void mahasiswa(int nim, String nama, String alamat, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public void BioData() {
        System.out.println("nim: " + nim);
        System.out.println("nama: " + nama);
        System.out.println("");
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat Datang Di Class Mahasiswa");

    }
}
