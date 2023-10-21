public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong() {

    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1), null);
        }
    }

    Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }

        return info;
    }

    // public void setPenumpang(Penumpang penumpang, int nomor) {
    // this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    // }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        int indexKursi = nomor - 1;
        if (indexKursi >= 0 && indexKursi < arrayKursi.length && arrayKursi[indexKursi].getPenumpang() == null) {
            this.arrayKursi[indexKursi].setPenumpang(penumpang);
        } else {
            System.out.println("Kursi " + nomor + " sudah ditempati.");
        }
    }
}
