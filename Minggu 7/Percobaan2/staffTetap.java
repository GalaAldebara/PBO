package Percobaan2;

import Percobaan1.staff;

public class staffTetap extends staff {
    public String golongan;
    public int asuransi;

    public staffTetap() {
    }

    public staffTetap(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan,
            String golongan, int asuransi) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    public void tampilStaffTetap() {
        System.out.println("===============Data Staff Tetap============");
        super.tampilDataStaff();
        System.out.println("Golongan        = " + golongan);
        System.out.println("Jumlah Asuransi = " + asuransi);
        System.out.println("Gaji Bersih     = " + (gaji + lembur - potongan - asuransi));
    }
}
