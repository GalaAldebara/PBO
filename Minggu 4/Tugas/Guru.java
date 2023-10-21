package Tugas;

public class Guru {
    private String nip;
    private String nama;
    private MataPelajaran mengajar;

    public Guru(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public MataPelajaran getMengajar() {
        return mengajar;
    }

    public void setMengajar(MataPelajaran mataPelajaran) {
        this.mengajar = mataPelajaran;
    }

    public String info() {
        return "NIP: " + nip + ", Nama: " + nama + ", Mata Pelajaran: " + mengajar.getNama();
    }

}