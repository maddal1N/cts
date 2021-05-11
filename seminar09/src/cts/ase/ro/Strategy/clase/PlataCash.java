package cts.ase.ro.Strategy.clase;

public class PlataCash implements Payable{

    @Override
    public void plateste(int suma) {
        System.out.println("S-a realizat o plata cu cash in valoare de " +suma +" lei");
    }
}
