public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Maaf, jumlah pinjaman harus lebih dari 0.");
            return;
        }

        if (jumlahPinjaman + jumlah > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Maaf, jumlah angsuran harus lebih dari 0.");
            return;
        }

        int minimumAngsuran = (int) (0.10 * jumlahPinjaman);

        if (jumlah < minimumAngsuran) {
            System.out.println("Maaf, angsuran harus minimal " + minimumAngsuran);
        } else {
            if (jumlah > jumlahPinjaman) {
                System.out.println("Maaf, jumlah angsuran melebihi jumlah pinjaman.");
            } else {
                jumlahPinjaman -= jumlah;

            }
        }
    }
}
