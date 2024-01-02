package Percobaan1;

public class manager extends karyawan {
    public int tunjangan;

    public manager() {
    }

    public void tampilDataManager() {
        super.tampilDataKaryawan();
        System.out.println("Tunjangan       = " + tunjangan);
        System.out.println("Total Gaji      = " + (super.gaji + tunjangan));
    }
}