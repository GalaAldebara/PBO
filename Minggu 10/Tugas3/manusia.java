package Tugas3;

public class manusia {
    public void nyalakanPerangkat(elektronik perangkat) {
        if (perangkat instanceof televisiJadul) {
            System.out.println("Nyalakan Televisi jadul dengan input: DIV");
            System.out.println("Voltase Televisi : " + perangkat.getVoltase());
        } else if (perangkat instanceof televisiModern) {
            System.out.println("Nyalakan Televisi jadul dengan input: HDMI");
            System.out.println("Voltase Televisi : " + perangkat.getVoltase());
        }
    }
}
