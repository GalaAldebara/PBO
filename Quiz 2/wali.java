import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class wali {
    private List<mahasiswa> daftarMahasiswa;
    private List<mataKuliah> daftarMataKuliah;

    // Konstruktor untuk inisialisasi daftar mahasiswa dan mata kuliah
    public wali() {
        this.daftarMahasiswa = new ArrayList<>();
        this.daftarMataKuliah = new ArrayList<>();
    }

    // Metode untuk menambahkan mahasiswa ke dalam perwalian
    public void tambahMahasiswa(mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    // Metode untuk menambahkan mata kuliah yang diambil oleh mahasiswa
    public void tambahMataKuliah(mataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    // Metode untuk mencetak seluruh data mahasiswa beserta mata kuliah yang diambil
    public void cetakDataPerwalian() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        for (mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama Mahasiswa: " + mahasiswa.nama);
            System.out.println("NIM: " + mahasiswa.nim);
            String formatIpk = decimalFormat.format(mahasiswa.hitungIpk());
            System.out.println("IPK: " + formatIpk);
            System.out.println("Mata Kuliah yang Diambil:");
            for (mataKuliah mataKuliah : daftarMataKuliah) {
                System.out.println("- " + mataKuliah.namaMataKuliah);
            }
            System.out.println("------------------------------");
        }
    }
}