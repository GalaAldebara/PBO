import java.text.DecimalFormat;
import java.util.List;

public class main {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("Arya Bagus Putra Pratama", "2241720098", List.of(3.5, 4.0, 3.7));
        mahasiswa mahasiswa2 = new mahasiswa("Muhammad Iqbal Makmur Al-Muniri", "2241720099", List.of(3.8, 3.5, 4.0));

        mataKuliah mataKuliah1 = new mataKuliah("Algoritma Struktur Data", 3, List.of(3.7, 4.0, 3.8));
        mataKuliah mataKuliah2 = new mataKuliah("Pemrograman Berbasis Objek", 4, List.of(3.5, 4.0, 3.9));

        int[] bobotSksMataKuliah1 = { 4, 4, 6 };
        double bobotMahasiswaMataKuliah2 = 1.2;

        wali perwalian = new wali();
        perwalian.tambahMahasiswa(mahasiswa1);
        perwalian.tambahMahasiswa(mahasiswa2);
        perwalian.tambahMataKuliah(mataKuliah1);
        perwalian.tambahMataKuliah(mataKuliah2);

        perwalian.cetakDataPerwalian();

        double ipkMahasiswa1Overload = mahasiswa1.hitungIpk(bobotSksMataKuliah1);
        double bobotMataKuliah1Overload = mataKuliah1.hitungBobot(bobotMahasiswaMataKuliah2);

        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        String formattedIpkMahasiswa1 = decimalFormat.format(ipkMahasiswa1Overload);
        String formattedBobotMataKuliah1 = decimalFormat.format(bobotMataKuliah1Overload);

        System.out.println("IPK Mahasiswa 1 (dengan overload): " + formattedIpkMahasiswa1);
        System.out.println("Bobot Mata Kuliah 1 (dengan overload): " + formattedBobotMataKuliah1);
    }
}
