public class Kursi {
    public String nomor;
    public Penumpang penumpang;

    public Kursi() {

    }

    Kursi(String nomor, Penumpang penumpang) {
        this.nomor = nomor;
        this.penumpang = penumpang;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
