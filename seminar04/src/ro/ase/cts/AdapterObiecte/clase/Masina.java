package ro.ase.cts.AdapterObiecte.clase;

public class Masina {
    private String denumire;
    private int nrCilindri;
    private float capacitateCilindrica;

    private static Masina instanta = null;

    // lazy initialization + thread safe
    public static synchronized Masina getInstace(String denumire, int nrCilindri, float capacitateCilindrica){
        if(instanta == null){
            instanta = new Masina(denumire,nrCilindri,capacitateCilindrica);
        }
        return instanta;
    }

    private Masina() {
        this.denumire="";
        this.nrCilindri =0;
        this.capacitateCilindrica=0.0f;
    }

    private Masina(String denumire, int nrCilindri, float capacitateCilindrica) {
        this.denumire = denumire;
        this.nrCilindri = nrCilindri;
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setNrCilindri(int nrCilindri) {
        this.nrCilindri = nrCilindri;
    }

    public void setCapacitateCilindrica(float capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Masina{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrCilindri=").append(nrCilindri);
        sb.append(", capacitateCilindrica=").append(capacitateCilindrica);
        sb.append('}');
        return sb.toString();
    }
}
