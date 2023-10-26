// SOAL NO 3
public class ClassY extends Class {
    int b = 5;
    int y = 0;

    int hitungY() {
        y = hitung() * b;
        return y;
    }

    public static void main(String[] args) {
        ClassY cy = new ClassY();
        System.out.println(cy.hitungY());
    }
}

// SOAL:
// Pada source code yang diberikan, class ClassY merupakan turunan dari
// clas Class. Sebutkan atribut dan mehtod apa saja yang diwarisi
// oleh ClassY dari kelas induknya (class Class). Jelaskan juga
// apa output dari code yang ditulis pada class ClassY dan bagaimana
// nilai tersebut diperoleh.

// Jawab:
// Atribut yang diwarisi dari Class ada dua yaitu int a dan int x
// Sedangkan atribut yang hanya ada di ClassY adalah int b dan int y

// Sedangkan method yang diwarisi dari class Class adalah method int hitung()
// dan method yang ada di class ClassY adalah method int hitungY()

// Jadi pada method main di classY objek cy dibuat dan kemudian method
// hitungY() dipanggil pada objek tersebut lalu method hitungY() menghitung
// nilai y dengan cara memanggil method hitung() dari class Class yang mereturn
// nilai x
// yang dimana variabel x telah dibuah melalui rumus yang ditetapkan diubah dari
// nilai 0
// menjadi memiliki nilai 5. Hasil perkalian tersebut menjadi nilai y yaitu y =
// hitung() * b

// Jadi output dari kode di ClassY adalah hasil pemanggilan cy.hitungY(),
// yang dimana method hitung() didalam cy.hitungY() akan mengubah nilai x
// menjadi
// 10, dan kemudian variabel x dikali dengan b yang memiliki nilai 5. Lalu hasil
// antara nilai x dan b akan dicetak.
