package ro.ase.cts;

public class Portar extends Jucator{
    public Portar(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Portar{");
        sb.append('}').append(super.toString());
        return sb.toString();
    }
}
