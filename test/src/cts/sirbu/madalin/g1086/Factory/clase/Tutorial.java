package cts.sirbu.madalin.g1086.Factory.clase;

public class Tutorial implements IClip{
    private String denumire;
    private int durata;

    public Tutorial(String denumire, int durata) {
        this.denumire = denumire;
        this.durata = durata;
    }

    @Override
    public void pause() {
        System.out.println("Tutorialul "+this.denumire + " a fost pus pe pause.");
    }

    @Override
    public void stop() {
        System.out.println("Tutorialul " +this.denumire + " a fost oprit.");
    }

    @Override
    public void resume() {
        System.out.println("Tutorialul "+this.denumire +" a fost reportnit.");
    }

    @Override
    public void start() {
        System.out.println("Tutorialul "+this.denumire +" a fost pornit.");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tutorial{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", durata=").append(durata);
        sb.append('}');
        return sb.toString();
    }
}
