package ro.ase.cts.AdapterObiecte.clase;

import java.util.ArrayList;
import java.util.List;

public class Retata implements AbstractPrototype{
    private List<String> denumireSolutii;
    private List<Integer> cantitati;

    private Retata() {
    }

    public Retata(List<String> denumireSolutii, List<Integer> cantitati) {
        this.denumireSolutii = denumireSolutii;
        //realizam validari
        this.cantitati = cantitati;
    }

    public List<String> getDenumireSolutii() {
        return denumireSolutii;
    }

    public void setDenumireSolutii(List<String> denumireSolutii) {
        this.denumireSolutii = denumireSolutii;
    }

    public List<Integer> getCantitati() {
        return cantitati;
    }

    public void setCantitati(List<Integer> cantitati) {
        this.cantitati = cantitati;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Retata{");
        sb.append("denumireSolutii=").append(denumireSolutii);
        sb.append(", cantitati=").append(cantitati);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractPrototype copiaza() {
        Retata copie = new Retata();
        copie.cantitati = new ArrayList<>();
        copie.cantitati.addAll(this.cantitati);
        copie.denumireSolutii = new ArrayList<>();
        copie.denumireSolutii.addAll(this.denumireSolutii);
        return copie;
    }
}
