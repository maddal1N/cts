package ro.ase.cts.Template.clase;

public class SpectatorNormal extends Template{
    private String nume;

    public SpectatorNormal(String nume) {
        this.nume = nume;
    }

    @Override
    public void seAsazaLaCoada() {
        System.out.println(this.nume + " s-a asezat la coada.");
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
        System.out.println(this.nume + " a ocupat loc la tribuna.");
    }
}
