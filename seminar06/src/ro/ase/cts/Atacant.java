package ro.ase.cts;

public class Atacant extends Jucator{
    public Atacant(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Atacant{");
        sb.append('}').append(super.toString());
        return sb.toString();
    }
}
