package ro.ase.cts.adapterClase.clase;

public class AdapterLeasingClase extends Leasing implements Creditable{

    public AdapterLeasingClase(String numeClient, int suma) {
        super(numeClient, suma);
    }

    @Override
    public void crediteaza() {
        super.oferaLeasing();
    }
}
