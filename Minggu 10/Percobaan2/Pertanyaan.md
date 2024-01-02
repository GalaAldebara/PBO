1. Perhatikan class Tester2 di atas, mengapa pemanggilan e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?
   Jawab: dikarenakan pada pemanggilan e.getEmployeeInfo() tersebut memanggil atau merujuk ke objek pEmp, maka dari itu dapat memanggil method yang ada di objek pEmp;

2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai pemanggilan method virtual (virtual method invication), sedangkan pEmp.getEmployeeInfo() tidak?
   Jawab: Dikarenakan pada method e.getEmployeeInfo() tersebut merujuk ke objek pEmp; sedangkan method pEmp.getEmployeeInfo() itu sudah termasuk didalam objek itu sendiri.

3. Jadi apakah yang dimaksud dari virtual method invocation? Mengapa disebut virtual?
   Jawab: Virtual method invocation terjadi ketika ada pemanggilan overriding method dari suatu objek polimorfisme. Disebut virtual karena antara method yang dikenali oleh compiler dan method yang dijalankan oleh JVM berbeda
