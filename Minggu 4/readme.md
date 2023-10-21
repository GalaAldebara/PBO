PERTANYAAN

Percobaan 1

1. Di dalam class Processor dan class Laptop, terdapat method setter dan getter untuk masing-masing atributnya. Apakah gunanya method setter dan getter tersebut?
   Jawab: Method setter digunakan untuk mengatur atau mengubah nilai atribut suatu objek dari luar kelas. Sedangkan method getter digunakan untuk mengambil atau mendapatkan nilai atribut suatu objek dari luar kelas.
2. Di dalam class Processor dan class Laptop, masing-masing terdapat konstruktor default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut?
   Jawab: Konstruktor default adalah konstruktor yang tidak menerima parameter. Sedangkan konstruktor berparameter adalah konstruktor yang menerima parameter saat objek dibuat.
3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object?
   Jawab: Atribut yang bertipe objek adalah objek dari class Processor.
4. Perhatikan class Laptop, pada baris manakah yang menunjukkan bahwa class Laptop memiliki relasi dengan class Processor?
   Jawab: pada baris private Processor proc;
5. Perhatikan pada class Laptop, Apakah guna dari sintaks proc.info()?
   Jawab: Sintaks proc.info() digunakan untuk memanggil metode info() dari objek proc yang merupakan objek dari class Processor.
6. Pada class MainPercobaan1, terdapat baris kode, Dan apakah yang terjadi jika baris kode tersebut diubah.
   Jawab: Maka akan muncul output seperti berikut
   Merk Laptop = Thinkpad
   Merk Processor = Intel i5
   Cache Memory = 3.00

Percobaan 2

1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukkan bahwa class Pelanggan memiliki relasi dengan class Mobil dan class Sopir?
   Jawab: Hubungan antara class Pelanggan dan class Mobil ditunjukan pada baris private Mobil mobil;. Sedangkan hubungan antara class Pelanggan dan class Sopir ditunjukkan pada baris private Sopir sopir;.
2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil. Menngapa menurut Anda method tersebut harus memiliki argument hari?
   Jawab: Method tersebut memerlukan argumen hari karena biaya sopir dan biaya mobil biasanya berhubungan dengan lamanya penggunaan, yang dalam konteks ini diwakili oleh jumlah hari. Dengan argumen 'hari', method ini dapat menghitung biaya berdasarkan periode penggunaan yang berbeda.
3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari)?.
   Jawab: Perintah mobil.hitungBiayaMobil(hari) digunakan untuk menghitung biaya total mobil berdasarkan jumlah hari penggunaan. Sedangkan perintah sopir. Sedangkan perintah sopir.hitungBiayaSopir(hari) digunakan untuk menghitung biaya total sopir berdasarkan jumlah hari penggunaan.
4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s)?
   Jawab: p.setMobil(m) digunakan untuk mengatur objek m sebagai mobil yang digunakan oleh pelanggan p. Sedangkan p.setSopir(s) digunakan untuk mengatur objek s sebagai sopir yang digunakan oleh pelanggan p.
5. Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal() tersebut?
   Jawab: Proses p.hitungBiayaTotal() digunakan untuk menghitung biaya total yang harus dibayar oleh pelanggan p. Biaya total ini adalah hasil dari biaya mobil (mobil.hitungBiayaMobil(hari)) dan biaya sopir (sopir.hitungBiayaSopir(hari)) yang dihitung berdasarkan jumlah hari (hari) yang telah diatur sebelumnya.
6. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method main dan amati perubahan saat di-run!
   Jawab: p.getMobil() digunakan untuk mengembalikan objek mobil yang dimiliki oleh pelanggan p. Sedangkan getMerk() digunakan pada objek mobil untuk mendapatkan merk mobil.

Percobaan 3

1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan this.asisten.info() digunakan untuk apa?
   Jawab: this.masinis.info() dan this.asisten.info() digunakan untuk mendapatkan informasi (NIP dan Nama) dari pegawai masinis dan asisten yang terkait dengan kereta api ini.
2. Buatlah main program baru dengan nama class MainPertanyaan pada package yang sama. Tambahkan kode berikut pada method main()
3. Apa hasil output dari main program tersebut? Mengapa hal tersebut dapat terjadi?
4. Perbaiki class KeretaApi sehingga program dapat berjalan!

Percobaan 4

1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A?
   Jawab: pada main program dalam class MainPercobaan4, jumlah kursi dalam Gerbong A adalah 10. berdasarkan new Gerbong("A", 10)
2. Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode tersebut?
   Jawab: Potongan kode pada method info() dalam class Kursi adalah untuk menghasilkan informasi tentang kursi, termasuk nomor kursi dan informasi penumpang yang duduk di kursi tersebut jika ada. Kode tersebut memeriksa apakah ada penumpang di kursi (objek penumpang tidak null) dan jika ada, akan mencetak informasi penumpang. Ini adalah cara untuk mencetak informasi kursi dan penumpang yang duduk di kursi tersebut jika ada.
3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi dengan angka 1?
   Jawab: Pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi 1 karena dalam array, indeks dimulai dari 0, sedangkan nomor kursi dimulai dari 1. Jadi, pengurangan 1 digunakan untuk mengakses indeks yang benar dalam array arrayKursi.
4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang terjadi?
   Jawab: objek budi akan ditempatkan di kursi pertama dalam gerbong. Ini berarti bahwa kursi nomor 1 akan memiliki penumpang dengan data yang sesuai dengan objek budi.
5. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada penumpang lain!
   Jawab:
   public void setPenumpang(Penumpang penumpang, int nomor) {
   int indexKursi = nomor - 1;
   if (indexKursi >= 0 && indexKursi < arrayKursi.length && arrayKursi[indexKursi].getPenumpang() == null) {
   this.arrayKursi[indexKursi].setPenumpang(penumpang);
   } else {
   System.out.println("Kursi " + nomor + " sudah ditempati.");
   }
   }
