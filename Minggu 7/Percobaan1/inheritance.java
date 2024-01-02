package Percobaan1;

import Percobaan2.staffHarian;
import Percobaan2.staffTetap;

public class inheritance {
    public static void main(String[] args) {
        manager M = new manager();
        M.nama = "Vivin";
        M.alamat = "Jl. Vinolia";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilDataManager();

        staff S = new staff();
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.tampilDataStaff();

        staffTetap ST = new staffTetap("Budi", "Malang", "Lakilaki", 20,
                2000000, 250000, 200000, "2A", 100000);
        ST.tampilStaffTetap();

        staffHarian SH = new staffHarian("Indah", "Malang", "Perempuan",
                27, 10000, 100000, 50000, 100);
        SH.tampilStaffHarian();
    }
}