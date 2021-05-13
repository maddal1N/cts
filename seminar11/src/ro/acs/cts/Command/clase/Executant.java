package ro.acs.cts.Command.clase;

public class Executant { //executantul e reprezentat de contul bancar
    private float sold;
    private String detinator;

    public Executant(String detinator) {
        this.detinator = detinator;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public String getDetinator() {
        return detinator;
    }

    public void setDetinator(String detinator) {
        this.detinator = detinator;
    }

    public void creazaCont(float suma){
        this.sold = suma;
        System.out.println("S-a constituit contul cu suma de " + this.sold);
    }

    public void retragere(float suma){
        if(suma<=sold){
            this.sold = sold - suma;
            System.out.println("S-a retras suma de " + suma);
        }
        else System.out.println("Fonduri insuficiente.");
    }

    public void depunere(float suma){
        this.sold = sold + suma;
        System.out.println("S-a depus suma de " + suma);
    }
}
