package ro.ase.cts.adapterClase.program;

import ro.ase.cts.adapterClase.clase.AdapterLeasingClase;
import ro.ase.cts.adapterClase.clase.Creditable;

public class Main {

    public static void printeazaInformatiiCredit(Creditable credit) {
        credit.crediteaza();
    }

    public static void main(String[] args) {
        AdapterLeasingClase adapterLeasing = new AdapterLeasingClase("Gigel",500);
        printeazaInformatiiCredit(adapterLeasing);
    }
}
