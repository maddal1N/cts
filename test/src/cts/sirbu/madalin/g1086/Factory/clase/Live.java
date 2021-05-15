package cts.sirbu.madalin.g1086.Factory.clase;

public class Live implements IClip{
    private String platformaStreaming;
    private String denumire;
    private int durata;

    public Live(String denumire, int durata) {
        this.denumire = denumire;
        this.durata = durata;
    }

    public Live(String platformaStreaming, String denumire, int durata) {
        this.platformaStreaming = platformaStreaming;
        this.denumire = denumire;
        this.durata = durata;
    }

    public void setPlatformaStreaming(String platformaStreaming) {
        this.platformaStreaming = platformaStreaming;
    }

    @Override
    public void pause() {
        System.out.println("Live-ul "+ this.denumire+ " a fost pus pe pause.");
    }

    @Override
    public void stop() {
        System.out.println("Live-ul " + this.denumire + " a fost oprit.");
    }

    @Override
    public void resume() {
        System.out.println("Live-ul " + this.denumire + " a fost repornit.");
    }

    @Override
    public void start() {
        System.out.println("Live-ul "  + this.denumire +  " a fost pornit.");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Live{");
        sb.append("platformaStreaming='").append(platformaStreaming).append('\'');
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append(", durata=").append(durata);
        sb.append('}');
        return sb.toString();
    }
}
