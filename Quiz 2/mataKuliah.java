import java.util.List;

public class mataKuliah {
    public String namaMataKuliah;
    public int sks;
    public List<Double> nilaiMahasiswa;

    // Konstruktor untuk inisialisasi atribut
    public mataKuliah(String namaMataKuliah, int sks, List<Double> nilaiMahasiswa) {
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    // Metode untuk menghitung bobot mata kuliah berdasarkan nilai mahasiswa
    public double hitungBobot() {
        double totalNilai = 0;
        for (double nilai : nilaiMahasiswa) {
            totalNilai += nilai;
        }

        if (nilaiMahasiswa.size() == 0) {
            return 0; // Menghindari pembagian oleh nol
        }

        return totalNilai / nilaiMahasiswa.size() * sks;
    }

    // Overload metode hitungBobot dengan memberikan bobot berdasarkan nilai
    // mahasiswa
    public double hitungBobot(double bobot_mahasiswa) {
        double totalNilai = 0;
        for (double nilai : nilaiMahasiswa) {
            totalNilai += nilai;
        }

        if (nilaiMahasiswa.size() == 0) {
            return 0; // Menghindari pembagian oleh nol
        }

        return totalNilai / nilaiMahasiswa.size() * sks * bobot_mahasiswa;
    }
}
