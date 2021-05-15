package ro.ase.cts.Template.clase;

public class SpectatorVIP extends Template{
    private String nume;
    private int nrLoja;

    public SpectatorVIP(String nume, int nrLoja) {
        this.nume = nume;
        this.nrLoja = nrLoja;
    }

    @Override
    public void seAsazaLaCoada() {
    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume + " a prezentat bilet.");
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println(this.nume + " a fost controlat corporal.");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(this.nume + " a ocupat locul la loja "+this.nrLoja);
    }
}
