package ro.ase.cts.Chain.Program;

import ro.ase.cts.Chain.Clase.Cont;
import ro.ase.cts.Chain.Clase.ContCredit;
import ro.ase.cts.Chain.Clase.ContCurent;
import ro.ase.cts.Chain.Clase.ContEconomii;

public class Main {
    public static void main(String[] args) {

        Cont contCurent = new ContCurent(2000);
        Cont contCredit = new ContCredit(1500);
        Cont contEconomii = new ContEconomii(1500);

        contCurent.setSuccesorCont(contCredit);
        contCredit.setSuccesorCont(contEconomii);

        contCurent.realizarePlata(1000);
        contCurent.realizarePlata(1500);
        contCurent.realizarePlata(1000);
        contCurent.realizarePlata(1000);

        contCurent.realizarePlata(1000);
        contCurent.realizarePlata(2000);
    }
}
