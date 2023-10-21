package Tugas;

import java.util.ArrayList;
import java.util.List;

public class MataPelajaran {
    private String nama;
    private List<Guru> guruList;
    private List<Siswa> siswaList;

    public MataPelajaran(String nama) {
        this.nama = nama;
        this.guruList = new ArrayList<>();
        this.siswaList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public List<Guru> getGuruList() {
        return guruList;
    }

    public void addGuru(Guru guru) {
        guruList.add(guru);
    }

    public List<Siswa> getSiswaList() {
        return siswaList;
    }

    public void addSiswa(Siswa siswa) {
        siswaList.add(siswa);
    }

    public String info() {
        String info = "Mata Pelajaran: " + nama + "\n";
        info += "Daftar Guru:\n";
        for (Guru guru : guruList) {
            info += guru.info() + "\n";
        }
        info += "Daftar Siswa:\n";
        for (Siswa siswa : siswaList) {
            info += siswa.info() + "\n";
        }
        return info;
    }
}
