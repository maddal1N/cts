package ro.acs.cts.Chain.program;

import ro.acs.cts.Chain.clase.Cont;
import ro.acs.cts.Chain.clase.ContCredit;
import ro.acs.cts.Chain.clase.ContCurent;
import ro.acs.cts.Chain.clase.ContEconomii;

public class Main {
    public static void main(String[] args) {
        Cont contCurent = new ContCurent(200);
        Cont contCredit = new ContCredit(150);
        Cont contEconomii = new ContEconomii(150);

        contCurent.setSuccesorCont(contCredit);
        contCredit.setSuccesorCont(contEconomii);

        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(150);
        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(100);
    }
}