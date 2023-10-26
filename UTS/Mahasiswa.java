// SOAL NO 4
public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    public Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("123456", "John Doe", "Jalan Contoh 123", 'L');

        System.out.println("NIM: " + mahasiswa1.nim);
        System.out.println("Nama: " + mahasiswa1.nama);
        System.out.println("Alamat: " + mahasiswa1.alamat);
        System.out.println("Jenis Kelamin: " + mahasiswa1.jenisKelamin);
    }
}
