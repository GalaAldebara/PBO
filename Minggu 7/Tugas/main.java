package Tugas;

public class main {
    public static void main(String[] args) {
        mac m1 = new mac("Mac", 3, 4, "Intel Core i5", "Li-on", "Avira");
        m1.tampilMac();

        windows w1 = new windows("Windows", 2, 8, "Intel Core i7", "Li-on", "Dark mode");
        w1.tampilWindows();

        pc p1 = new pc("Pc", 4, 8, "Intel Core i3", 10);
        p1.tampilPc();
    }
}
