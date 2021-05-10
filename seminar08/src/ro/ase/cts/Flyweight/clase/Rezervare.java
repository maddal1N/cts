package ro.ase.cts.Flyweight.clase;

public class Rezervare {
    private int nrRezervare;
    private int nrMasa;

    public Rezervare(int nrRezervare, int nrMasa) {
        this.nrRezervare = nrRezervare;
        this.nrMasa = nrMasa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rezervare{");
        sb.append("nrRezervare=").append(nrRezervare);
        sb.append(", nrMasa=").append(nrMasa);
        sb.append('}');
        return sb.toString();
    }
}
