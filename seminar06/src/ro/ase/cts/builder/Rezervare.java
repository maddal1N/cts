package ro.ase.cts.builder;

public class Rezervare {
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaInclusa;
    private boolean areMuzicaAmbientala;
    private String genMuzical;

    public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBauturaInclusa, boolean areMuzicaAmbientala, String genMuzical) {
        this.codRezervare = codRezervare;
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturaInclusa = areBauturaInclusa;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.genMuzical = genMuzical;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreBauturaInclusa(boolean areBauturaInclusa) {
        this.areBauturaInclusa = areBauturaInclusa;
    }

    public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", areMancareInclusa=").append(areMancareInclusa);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areBauturaInclusa=").append(areBauturaInclusa);
        sb.append(", areMuzicaAmbientala=").append(areMuzicaAmbientala);
        sb.append(", genMuzical='").append(genMuzical).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
