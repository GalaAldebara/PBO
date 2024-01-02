package Tugas3;

public class testElektronik {
    public static void main(String[] args) {
        manusia indro = new manusia();
        televisiJadul tvJadul = new televisiJadul();
        televisiModern tvModern = new televisiModern();

        indro.nyalakanPerangkat(tvJadul);
        indro.nyalakanPerangkat(tvModern);
    }
}
