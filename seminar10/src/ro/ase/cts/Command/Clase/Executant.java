package ro.ase.cts.Command.Clase;

public class Executant {
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
        System.out.println("S-a constituit contul cu suma de " + suma);
    }

    public void retrageSuma(float suma){
        if(suma <= this.sold){
            this.sold -= suma;
            System.out.println("S-a retras suma de " + suma);
        }else{
            System.out.println("Suma e prea mare");
        }
    }

    public void depunereSuma(float suma){
        this.sold += suma;
        System.out.println("Suma a fost depusa");
    }
}
