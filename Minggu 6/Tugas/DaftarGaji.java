package Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int count;

    public DaftarGaji(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
        count = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (count < listPegawai.length) {
            listPegawai[count] = pegawai;
            count++;
        } else {
            System.out.println("Daftar gaji sudah penuh");
        }
    }

    public void printSemuaGaji() {
        for (Pegawai pegawai : listPegawai) {
            if (pegawai != null) {
                System.out.println("Nama Pegawai: " + pegawai.getNama() + " - Gaji: " + pegawai.getGaji());
            }
        }
    }
}
