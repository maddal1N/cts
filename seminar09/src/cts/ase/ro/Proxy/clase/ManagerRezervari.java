package cts.ase.ro.Proxy.clase;

public class ManagerRezervari implements Rezervabil{
    private String numeLocal;

    public ManagerRezervari(String numeLocal) {
        this.numeLocal = numeLocal;
    }

    @Override
    public void rezerva(int nrPersoane) {
        System.out.println("A fost realizata o rezervare la restaurantul " + numeLocal + " pentru "+nrPersoane+" persoane.");
    }
}