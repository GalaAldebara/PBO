    public class PerkalianKu {
    void perkalian(int a, int b){
    System.out.println(a \* b);
    }

        void perkalian(int a, int b, int c){
            System.out.println(a * b * c);
        }

        public static void main(String[] args) {
            PerkalianKu objek = new PerkalianKu();
            objek.perkalian(25, 43);
            objek.perkalian(34, 23, 56);
        }

    }

1.  Dari source coding diatas terletak dimanakah overloading?
    Jawab :
    Overloading terletak pada method perkalian dengan jumlah parameter yang berbeda.

2.  Jika terdapat overloading ada berapa tipe parameter yang berbeda?
    Jawab :
    Pada method perkalian pertama terdapat 2 parameter yaitu (int a,int b) sedangkan method perkalian kedua terdapat 3 parameter yaitu (int a,int b,int c).
    public class PerkalianKu {
    void perkalian(int a, int b){
    System.out.println(a \* b);
    }

        void perkalian(double a, double b){
            System.out.println(a * b);
        }

        public static void main(String[] args) {
            PerkalianKu objek = new PerkalianKu();
            objek.perkalian(25, 43);
            objek.perkalian(34.56, 23.7);
        }

    }

3.  Dari source coding diatas terletak dimanakah overloading?
    Jawab :
    Overloading terletak pada method perkalian dengan tipe parameter yang berbeda.

4.  Jika terdapat overloading ada berapa tipe parameter yang berbeda?
    Jawab :
    pada method pertama parameter bertipe data integer sedangkan method kedua parameternya bertipe data double.
