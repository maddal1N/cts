package cts.ase.ro.Strategy.clase;

public class PlataBonuriMasa implements Payable{
    @Override
    public void plateste(int suma) {
        System.out.println("S-a realizat o plata cu bonuri de masa in valoare de " +suma +" lei");
    }
}
