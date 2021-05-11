package cts.ase.ro.Strategy.clase;

public class PlataCard implements Payable{

    @Override
    public void plateste(int suma) {
        System.out.println("S-a realizat o plata cu cardul in valoare de " +suma +" lei");
    }
}
