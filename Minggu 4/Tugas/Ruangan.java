package Tugas;

public class Ruangan {
    private String nomorRuangan;
    private MataPelajaran mataPelajaran;

    public Ruangan(String nomorRuangan) {
        this.nomorRuangan = nomorRuangan;
    }

    public String getNomorRuangan() {
        return nomorRuangan;
    }

    public void setNomorRuangan(String nomorRuangan) {
        this.nomorRuangan = nomorRuangan;
    }

    public MataPelajaran getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(MataPelajaran mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    public String info() {
        return "Nomor Ruangan: " + nomorRuangan + ", Mata Pelajaran: " + mataPelajaran.getNama();
    }
}
