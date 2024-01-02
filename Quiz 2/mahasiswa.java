import java.util.List;

public class mahasiswa {
    public String nama;
    public String nim;
    public List<Double> nilai;

    public mahasiswa(String nama, String nim, List<Double> nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public double hitungIpk() {
        double totalNilai = 0;
        for (double nilaiMataKuliah : nilai) {
            totalNilai += nilaiMataKuliah;
        }
        return totalNilai / nilai.size();
    }

    public double hitungIpk(int[] nilai_sks) {
        double totalNilaiSks = 0;
        int totalSks = 0;

        for (int i = 0; i < nilai.size(); i++) {
            totalNilaiSks += nilai.get(i) * nilai_sks[i];
            totalSks += nilai_sks[i];
        }

        if (totalSks == 0) {
            return 0;
        }

        return totalNilaiSks / totalSks;
    }
}