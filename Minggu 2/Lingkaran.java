public class Lingkaran {
    public double phi;
    public double r;
    public double HitungLuas;
    public double HitungKeliling;

    public double HitungLuas(double r) {
        phi = 3.14;
        HitungLuas = phi * r * r;
        return HitungLuas;
    }

    public double HitungKeliling(double r) {
        phi = 3.14;
        HitungKeliling = phi * 2 * r;
        return HitungLuas;
    }

    public void TampilLingkaran() {
        System.out.println("Luas Lingkaran: " + HitungLuas);
        System.out.println("Keliling    : " + HitungKeliling);
    }
}
