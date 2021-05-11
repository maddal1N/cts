package cts.ase.ro.State.clase;

public class Masa {
    private int nrMasa;
    private State stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new Libera();
    }

    public void rezervaMasa(){
        if(this.stare instanceof Libera){
            System.out.println("Masa "+nrMasa+" a fost rezervata.");
            this.stare = new Rezervata();
        }
        else System.out.println("Masa nu poate fi rezervata.");
    }

    public void ocupaMasa(){
        if(!(this.stare instanceof Ocupata)){
            System.out.println("Masa "+nrMasa+" a fost ocupata.");
            this.stare = new Ocupata();
        }
        else System.out.println("Masa nu poate fi ocupata.");
    }

    public void eliberareMasa(){
        if(!(this.stare instanceof Libera)){
            System.out.println("Masa "+nrMasa+" a fost eliberata.");
            this.stare = new Libera();
        }
        else System.out.println("Masa nu poate fi eliberata.");
    }
}
