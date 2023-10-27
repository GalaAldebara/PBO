    PERTANYAAN

Percobaan 1

1. Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!
2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!
   Jawab: Program tersebut error karena belum ada program untuk implementasi metode setX dan setY.

Percobaan 2

1. Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut dijalankan dan tidak error!
2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!
   Jawab: Modifier yang digunakan pada variabel x dan y adalah private sehingga perlu diubah menjadi protected agar variabel tersebut dapat diturunkan dan digunakan pada class lain.

Percobaan 3

1. Jelaskan fungsi "super" pada potongan program berikut di class Tabung!
   Jawab: Kode program tersebut digunakan untuk mengakses variabel instance dari kelas induk (superclass) di dalam kelas turunan (subclass).
2. Jelaskan fungsi "super" dan "this" pada potongan program berikut di class Tabung!
   Jawab: Potongan kode program tersebut digunakan untuk menghitung volume dari objek tabung berdasarkan atribut-atribut yang diwarisi dari kelas induk yaitu class bangun dan atribut lokal milik class Tabung.
3. Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut "phi" dan "r" tetapi class tersebut dapat mengakses atribut tersebut!
   Jawab: Itu karena pengaruh dari modifier protected yang memungkinkan akses ke anggota kelas (field, method) dalam kelas yang sama, subclass, atau kelas dalam paket yang sama.

Percobaan 4

1. Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasannya!
   Jawab: ClassC adalah subclass dari ClassB, dan ClassB adalah subclass dari ClassA. Alasannya adalah karena pada ClassA tidak ada class lain yang mewarisi atau menerapkan class lain. ClassB mewarisi dari ClassA yang berarti ClassB memperoleh semua atribut dan method yang didefinisikan ClassA. ClassC mewarisi ClassB yang secara tidak langsung juga mewarisi ClassA.
2. Ubahlah isi konstruktor default ClassC seperti berikut!
3. Ubahlah isi konstruktor default ClassC seperti berikut! Kenapa bisa tampil output seperti berikut pada saat instansiasi objek test dari class ClassC?
   Jawab: super() digunakan untuk memanggil konstruktor dari superclass yang diwarisi oleh ClassC. Ketika kita membuat objek dari subclass, konstruktor class induk dipanggil sebelum konstruktor class anak.
4. Apakah fungsi super() pada potongan program dibawah ini di ClassC!
   Jawab: berfungsi untuk memanggil konstruktor dari ClassC.
