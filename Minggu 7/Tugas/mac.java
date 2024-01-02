package Tugas;

public class mac extends laptop {
    public String security;

    public mac() {

    }

    public mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        super.merk = merk;
        super.kecProsesor = kecProsesor;
        super.sizeMemory = sizeMemory;
        super.jnsProsesor = jnsProsesor;
        super.jnsBatrei = jnsBatrei;
        this.security = security;
    }

    public void tampilMac() {
        System.out.println("================================");
        super.tampilLaptop();
        System.out.println("Security : " + security);
    }
}
