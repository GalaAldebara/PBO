Jobsheet 3
Percobaan 2 -  Access Modifier
1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan
   "Kecepatan tidak bisa bertambah karena Mesin Off!"?
   Jawab:
   Muncul peringatan tidak bisa bertambah karena mesin off karena terdapat kondisi
   if (kontakOn == true)
3. Mengapa atribut kecepatan dan kontakOn diset private?
   Jawab:
   Atribut kecepatan dan kontakOn diset private untuk menerapkan konsep enkapsulasi dalam OOP.
5. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!
   Jawab:

Pertanyaan - Percobaan 3 dan 4
1. Apa yang dimaksud getter dan setter?
   Jawab:
   Setter adalah metode yang digunakan untuk mengatur atau mengubah nilai dari suatu atribut dalam class.
   Sedangkan getter adalah metode yang digunakan untuk mendapatkan atau membaca nilai dari suatu atribut
   dalam class.
3. Apa kegunaan dari method getSimpanan()?
   Jawab:
   Berfungsi untuk mereturn nilai simpanan dari objek anggota.
4. Method apa yang digunakan untuk menambah saldo?
   Jawab:
   public void setor(float uang) {
     simpanan += uang;
   } 
5. Apa yang dimaksud konstruktor?
   Jawab:
   Konstruktor adalah metode khusus dalam sebuah class yang memiliki nama yang sama dengan nama class itu
   sendiri. Digunakan untuk menginisialisasi objek saat objek diinstansiasi dari class.
6. Sebutkan aturan dalam membuat konstruktor?
   Jawab:
   1. Nama konstruktor harus sama persis dengan nama class.
   2. Tidak return.
   3. Menyediakan konstruktor default.
   4. Tidak ada modifier pengembalian.
7. Apakah boleh konstruktor bertipe private?
   Jawab:
   Tidak boleh karena salah satu aturan dari konstruktor adalah tidak menggunakan modifier pengembalian,
   seperti public, private, dan protected.
8. Kapan menggunakan parameter dengan passing parameter?
   Jawab:
   Saat ingin menghindari redudansi kode atau pengulangan kode yang serupa dalam method yang berbeda.
9. Apa perbedaan atribut class dan instansiasi atribut
   Jawab:
   Atribut class adalah atribut yang terkait dengan kelas itu sendiri, bukan dengan instance dari kelas tsb.
   Sedangkan atribut instansiasi adalah atribut yang terkait dengan instance dari kelas tersebut.
10. Apa perbedaan class method dan instansiasi method?
   Jawab:
   Perbedaan antara metode kelas (class methods) dan metode instansiasi terletak pada cara mereka dipanggil,
   objek yang digunakan, dan jenis operasi yang biasanya dilakukan. Metode class dipanggil pada class itu
   sendiri tanpa memerlukan objek. Sedangkan Metode instansiasi digunakan untuk melakukan operasi yang
   bergantung pada data atau keadaan objek tertentu. Mereka biasanya bekerja dengan atribut instansiasi dan
   digunakan untuk mengakses atau mengubah data objek.

TUGAS
2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada saat ditampilkan
   layar nilainya 30, jelaskan mengapa.
   Jawab:
   Karena pada method setAge terdapat kondisi
   if (newAge > 30) {
     age = 30
   }
   yang berfungsi jika newAge lebih dari 30 maka newAge akan diubah nilainya menjadi 30. Sedangkan
   pada class EncapTest, encap.setAge adalah 35 yang otomatis akan langsung di convert menjadi 30.
3. Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18.
   Jawab:
    public void setAge(int newAge) {
            if (newAge >= 18 && newAge <= 30) {
                age = newAge;
            }
    
            else if (newAge < 18) {
                age = 18;
            }
    
            else {
                age = 30;
            }
      }
