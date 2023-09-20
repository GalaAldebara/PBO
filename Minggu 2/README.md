JOBSHEET 2 PEMROGRAMAN BERBASIS OBJEK

Percobaan 1 (Membuat Class Diagram)

Studi Kasus 1:
Dalam suatu perusahaan salah satu dayang yang diolah adalah data karyawan. Setiap karyawan memiliki id, nama, jenis kelamin, jabatan, dan gaji. Setiap karyawan juga bisa menampilkan data diri pribadi dan melihat gajinya.

2. Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!
   Ada 2 class, yaitu class Karyawan, dan class KaryawanMain.

3. Sebutkan atribut beseta tipe datanya yang dapat diidentifikasi dari masing-masing class dari studi kasus 1!
   Id : int
   Nama : String
   JenisKelamin : String
   Jabatan : String
   Gaji : int

4. Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi kasus 1!
   Methodnya adalah TampilBiodata() dengan tipe data void. Dan TampilGaji() dengan tipe data void.

Percobaan 2 (Membuat dan mengakses anggota suatu class)

Studi Kasus 2:
Perhatikan class diagram dibawah ini. Buatlah program berdasarkan class diagram tersebut!

7. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!
   public int nim;
   public String nama;
   public String alamat;
   public String kelas;

8. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!
   public void tampilBiodata() {
   System.out.println("Nim : "+ nim);
   System.out.println("Nama : "+ nim);
   System.out.println("Alamat : "+ nim);
   System.out.println("Kelas : "+ nim);
   }

9. Berapa banyak objek yang di instansiasi pada program diatas!
   Terdapat 1 objek yang di instansiasi, yaitu mahasiswa.

10. Apakah yang sebenarnya dilakukan pada sintaks program "mhs1.nim = 101"?
    Yang dilakukan pada potongan kode program diatas adalah menginisialisasi nilai atribut nim dari objek mhs1 menjadi 101.

11. Apakah yang sebenarnya dilakukan pada sintaks program "mhs1.tampilBiodata()"?
    Sintaks program diatas berfungsi untuk memanggil metode fungsi tampilBiodata() pada objek mhs1.

12. Instansiasi 2 objek lagi pada program diatas!
    mhs2.nim = 102;
    mhs2.nama = "Sekar";
    mhs2.alamat = "Jl. Ikan Tombro No 5c";
    mhs2.kelas = "1A";
    mhs2.tampilBiodata()

    mhs2.nim = 103;
    mhs2.nama = "Reynald";
    mhs2.alamat = "Sulfat Jembatan";
    mhs2.kelas = "1A";
    mhs2.tampilBiodata()

Percobaan 3 (Menulis method yang memiliki argument / parameter dan memiliki return)

7. Apakah fungsi argument dalam suatu method?
   Fungsi dari argument dalam suatu method adalah untuk mengembalikan hasil berdasarkan argument yang diberikan.

8. Ambil kesimpulan tentang kegunaan dari kata kunci return, dan kapan suatu method harus memiliki return!
   Return berfungsi untuk mengembalikan nilai dari method. Setelah return dieksekusi dalam sebuah method, maka eksekusi akan berhenti dan program akan kembali ke method. Return digunakan untuk sebuah method yang menghitung sesuatu dan penggunaannya berlanjut. Return tidak digunakan jika sebuah method tidak mengembalikan nilai.
# PBO
