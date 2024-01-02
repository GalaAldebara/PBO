package Tugas2;

public class pegawai {
    protected String nama;
    protected int gaji;

    pegawai() {

    }

    pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }
}
