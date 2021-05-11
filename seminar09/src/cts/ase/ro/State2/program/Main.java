package cts.ase.ro.State2.program;

import cts.ase.ro.State2.clase.Masa;
import cts.ase.ro.State2.clase.StareLibera;

public class Main {
    public static void main(String[] args) {

        Masa masa = new Masa(3);
        masa.elibereazaMasa();

        masa.rezervaMasa();
        masa.rezervaMasa();

        masa.ocupaMasa();
        masa.ocupaMasa();
        //asa.setStare(new StareLibera());

        masa.rezervaMasa();

        masa.elibereazaMasa();
        masa.elibereazaMasa();
    }
}
