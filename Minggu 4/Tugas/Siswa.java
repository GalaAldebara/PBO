package Tugas;

public class Siswa {
    private String nomorInduk;
    private String nama;
    private MataPelajaran mataPelajaran;

    public Siswa(String nomorInduk, String nama) {
        this.nomorInduk = nomorInduk;
        this.nama = nama;
    }

    public String getNomorInduk() {
        return nomorInduk;
    }

    public void setNomorInduk(String nomorInduk) {
        this.nomorInduk = nomorInduk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public MataPelajaran getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(MataPelajaran mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    public String info() {
        return "Nomor Induk: " + nomorInduk + ", Nama: " + nama + ", Mata Pelajaran: " + mataPelajaran.getNama();
    }
}
