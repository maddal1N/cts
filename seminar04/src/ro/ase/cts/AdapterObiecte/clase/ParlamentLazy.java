package ro.ase.cts.AdapterObiecte.clase;

public class ParlamentLazy {
    private String tara;
    private int nrParlamentari;
    private int durataMandat;
    private String denumireSediu;

    // lazy initialization + thread safe
    private static ParlamentLazy instanta = null;

    public static synchronized ParlamentLazy getInstance(String tara, int nrParlamentari, int durataMandat, String denumireSediu){
        if(instanta == null){
            instanta = new ParlamentLazy(tara,nrParlamentari,durataMandat,denumireSediu);
        }
        return instanta;
    }

    private ParlamentLazy() {
        this.tara="";
        this.nrParlamentari=0;
        this.durataMandat=0;
        this.denumireSediu="";
    }

    private ParlamentLazy(String tara, int nrParlamentari, int durataMandat, String denumireSediu) {
        this.tara = tara;
        this.nrParlamentari = nrParlamentari;
        this.durataMandat = durataMandat;
        this.denumireSediu = denumireSediu;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public void setNrParlamentari(int nrParlamentari) {
        this.nrParlamentari = nrParlamentari;
    }

    public void setDurataMandat(int durataMandat) {
        this.durataMandat = durataMandat;
    }

    public void setDenumireSediu(String denumireSediu) {
        this.denumireSediu = denumireSediu;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Parlament{");
        sb.append("tara='").append(tara).append('\'');
        sb.append(", nrParlamentari=").append(nrParlamentari);
        sb.append(", durataMandat=").append(durataMandat);
        sb.append(", denumireSediu='").append(denumireSediu).append('\'');
        sb.append('}');
        return sb.toString();
    }
}