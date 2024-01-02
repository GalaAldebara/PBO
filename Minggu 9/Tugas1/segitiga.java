package Tugas1;

public class segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        return sudut = 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return sudut = 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sudut = sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2)) + Math.sqrt(Math.pow(sisiB, 2));
    }

    public void infoSudut() {
        System.out.println("Hasilnya = " + this.sudut);
    }
}
