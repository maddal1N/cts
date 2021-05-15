package ro.ase.cts.Template.clase;

public abstract class Template {

    public final void intraPeStadion(){
        seAsazaLaCoada();
        prezintaBilet();
        seFaceControlCorporal();
        ocupaLoc();
    }

    public abstract void seAsazaLaCoada();
    public abstract void prezintaBilet();
    public abstract void seFaceControlCorporal();
    public abstract void ocupaLoc();
}
