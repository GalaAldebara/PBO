public class Persegi {
    public int sisi;
    public int TampilSisi;
    public int HitungLuas;
    public int HitungKeliling;

    public void TampilSisi(int sisi) {
        TampilSisi = sisi;
    }

    public void HitungLuas(int sisi) {
        HitungLuas = sisi * sisi;
    }

    public void HitungKeliling(int sisi) {
        HitungKeliling = sisi * 4;

    }

    public void cetakMethod() {
        System.out.println("Luas Sisi: " + HitungLuas);
        System.out.println("Keliling: " + HitungKeliling);
        // System.out.println("Tampil Sisi: " + TampilSisi(sisi));
    }
}
