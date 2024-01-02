1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objek objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek iEmp (objek dari InternshipEmployee) ?
   Jawab: Dikarenakan isi dari array e tersebut adalah subclass atau class turunan dari class Employee.

2. Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek eBill (objek dari ElectricityBilling) ?
   Jawab: Dikarenakan isi dari array p tersebut adalah implements dari class interface Payable.

3. Perhatikan baris ke-10, mengapa terjadi error?
   Jawab: Terjadi error dalam pengisian array dikarenakan untuk array Employee hanya bisa diisi dengan objek dari class itu sendiri ataupun class turunannya. Jadi selain dari itu objek tidak bisa dimasukkan pada array Employee;
