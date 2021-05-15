package cts.sirbu.madalin.g1086.Composite.clase;

import cts.sirbu.madalin.g1086.Factory.clase.IClip;

public class Tutorial implements IClip,ComponentaAbstracta {
    private String denumire;
    private int durata;
    private float castigDinReclame;

    public Tutorial(String denumire, int durata, float castigDinReclame) {
        this.denumire = denumire;
        this.durata = durata;
        this.castigDinReclame = castigDinReclame;
    }

    public Tutorial(String denumire, int durata) {
        this.denumire = denumire;
        this.durata = durata;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void pause() {
        System.out.println("Tutorialul a fost pus pe pause.");
    }

    @Override
    public void stop() {
        System.out.println("Tutorialul a fost oprit.");
    }

    @Override
    public void resume() {
        System.out.println("Tutorialul a fost reportnit.");
    }

    @Override
    public void start() {
        System.out.println("Tutorialul a fost pornit.");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tutorial{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", durata=").append(durata);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void printareElement() {
        System.out.println(this.toString());
    }

    @Override
    public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(ComponentaAbstracta componentaAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ComponentaAbstracta getNod(int pozitie) {
        throw new UnsupportedOperationException();
    }
}
