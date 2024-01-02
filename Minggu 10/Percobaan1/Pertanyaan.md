1. Class apa sajakah yang merupakan turunan dari class Employee?
   Jawab: class InteshipEmployee dan PermanentEmployee

2. Class apa sajakah yang implements ke interface Payable?
   Jawab: class PermanentEmployee dan ElectricityBill

3. Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek iEmp (merupakan objek dari class InternshipEmploye) ?
   Jawab: Karena objek pEmp dan iEmp adalah turunan atau subclass dari class Employee (e)

4. Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek eBill (merupakan objek dari class ElectricityBill) ?
   Jawab: Karena objek pEmp dan eBill berada dalam satu interface yaitu inteface Payable

5. Coba tambahkan sintaks:
   p = iEmp;
   e = eBill;
   pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang menyebabkan error?
   Jawab:
   p = iEmp;
   Error dikarenakan objek iEmp tidak berelasi atau tidak mempunyi iterface dari Payable.
   e = eBill;
   Error dikarenakan objek eBill bukan termasuk class turunan dari Employee.

6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!
   Jawab: Dengan polimorfisme, kita dapat menangani objek secara lebih umum dan fleksibel, meningkatkan reusabilitas kode, mengurangi ketergantungan pada tipe data tertentu dan membuat pengembangan perangkat lunak menjadi lebih mudah dan efisien.
