package Tugas;

public class TugasMain {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(3);

        Pegawai p1 = new Pegawai("001", "Unggul Pamenang", "Jl. Soekarno Hatta");
        Dosen d1 = new Dosen("002", "Yulianto", "Jl. Semeru");

        d1.setSKS(10);

        daftar.addPegawai(p1);
        daftar.addPegawai(d1);

        daftar.printSemuaGaji();
    }
}
