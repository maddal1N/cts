package ro.ase.cts.adapterObiecte.program;

import ro.ase.cts.adapterObiecte.clase.AdapterLeasing;
import ro.ase.cts.adapterObiecte.clase.Creditable;
import ro.ase.cts.adapterObiecte.clase.Leasing;

public class Main {

    public static void printeazaInformatiiCredit(Creditable credit) {
        credit.crediteaza();
    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Bogdan",10000);
        AdapterLeasing adapterLeasing = new AdapterLeasing(leasing);
        adapterLeasing.crediteaza();
        System.out.println("-----------");
        printeazaInformatiiCredit(adapterLeasing);
    }
}
