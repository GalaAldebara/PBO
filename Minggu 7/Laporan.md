Percobaan 1

1. Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas!
   Jawab :
   Superclass adalah Karyawan, Subclass adalah Manager dan Staff
2. Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?
   Jawab :
   Untuk menurunkan class kita menggunakan extends format penggunaannya adalah, subClass(childClass) extends superClass(parentsClass)
3. Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan!
   Jawab :
   Atribut yang dimiliki oleh class Manager : tunjangan
   Atribut yang diwarisi dari class Karyawan : nama, alamat, jk, umur, gaji
4. Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class Manager!
   System.out.println("Total Gaji = " + (super.gaji + tunjangan));
   Jawab :
   Kata kunci super digunakan untuk memanggil atribut gaji pada super class (Karyawan)
5. Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa Jelaskan alasannya!
   Jawab :
   Termasuk inheritance Hierarchical karena class tersebut memiliki beberapa subclass(childClass) atau dengan kata lain jika beberapa subclass memiiliki superclass yang sama. Pada percobaan 1, class Karyawan memiliki 2 sub class yaitu Manager dan Staff. itu berarti atribut dan method yang terdaoat pada class Manager dapat diturukan/digunakan oleh sub class (Manager dan Staff)

Percobaan 2

1. Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance?
   Jawab :
   Single: Karyawan-Manager
   Multilevel: Karyawan-Staff-StaffTetap, Karyawan-Staff-StaffHarian
2. Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Staff!
   Jawab :
   a. Atribut class StaffTetap : golongan, asuransi
   b. Atribut class StaffHarian : jmlJamKerja
   c. Atribut yang diwarisi dari class Staff : lembur dan potongan.
   Karena class Staff diwarisi dari class Karyawan, maka ada atribut yang diwarisi dari class karyawan juga,
   diantaranya yaitu : nama, alamat, jk, umur, gaji

3. Apakah fungsi potongan program berikut pada class StaffHarian
   super(lembur, potongan, nama, alamat, jk, umur, gaji);
   Jawab :
   Fungsinya untuk memanggil konstruktor berparameter dari class Staff

4. Apakah fungsi potongan program berikut pada class StaffHarian
   super.tampilDataStaff();
   Jawab :
   Fungsinya untuk memanggil method tampilDataStaff() dari class Staff

5. Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap
   System.out.println("Gaji Bersih = " + (gaji + lembur - potongan - asuransi));
   Terlihat dipotongan program diatas atribut gaji, lembur dan potongan dapat diakses langsung. Kenapa hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji,lembur, dan potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur,dan potongan?
   Jawab :
   Karena pada class StaffTetap telah di extends class Staff sehingga atribut Gaji, Lembur dan potongan pada class Staff dapat di akses oleh class StaffTetap
