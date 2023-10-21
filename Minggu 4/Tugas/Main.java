package Tugas;

public class Main {
    public static void main(String[] args) {
        MataPelajaran matematika = new MataPelajaran("Matematika");
        MataPelajaran bahasaInggris = new MataPelajaran("Bahasa Inggris");

        Guru guru1 = new Guru("1234", "Mr. Smith");
        Guru guru2 = new Guru("5678", "Ms. Johnson");

        Siswa siswa1 = new Siswa("S001", "Alice");
        Siswa siswa2 = new Siswa("S002", "Bob");

        guru1.setMengajar(matematika);
        guru2.setMengajar(bahasaInggris);

        siswa1.setMataPelajaran(matematika);
        siswa2.setMataPelajaran(bahasaInggris);

        matematika.addGuru(guru1);
        bahasaInggris.addGuru(guru2);
        matematika.addSiswa(siswa1);
        bahasaInggris.addSiswa(siswa2);

        System.out.println("Info Mata Pelajaran:");
        System.out.println(matematika.info());
        System.out.println(bahasaInggris.info());
    }
}
