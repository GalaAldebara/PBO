1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan, padahal jika diperhatikan method pay() yang ada di dalam class Owner memiliki argument/parameter bertipe Payable? Jika diperhatikan lebih detil eBill merupakan objek dari ElectricityBill dan pEmp merupakan objek dari PermanentEmployee?
   Jawab: Dikarenakan untuk argument pEmp adalah sebuah objek dari class PermanentEmployee yang mengimplements class interface Payable.

2. Jadi apakah tujuan membuat argument bertipe Payable pada method pay() yang ada di dalam class Owner?
   Jawab: Tujuan dari pembuatan argument bertipe Payable pada method pay() yang ada didalam class Owner dikarenakan untuk menyederhanakan pemanggilan method pada suatu sublass atau class turunan

3. Coba pada baris terakhir method main() yang ada di dalam class Tester4 ditambahkan perintah ow.pay(iEmp); Mengapa terjadi error?
   Jawab: Terjadi error dikarenakan argument yang dimasukkan tidak sesuai dengan yang dideklarasikan. Objek iEmp adalah bukan termasuk dari implements dari class interface Payable

4. Perhatikan class Owner, diperlukan untuk apakah sintaks p instanceof ElectricityBill pada baris ke-6 ?
   Jawab: Diperlukan untuk mengecek argument p apakah sebuah instansiasi objek dari class ElectricityBill

5. Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek disana (ElectricityBill eb = (ElectricityBill) p) diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke dalam objek eb yang bertipe ElectricityBill ?
   Jawab: Dikarenakan menyesuaikan dari argument serta objek yang dibuat pada masing-masing class yang terhubung dengan interface Payable.
