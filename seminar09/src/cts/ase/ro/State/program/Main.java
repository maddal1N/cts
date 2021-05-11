package cts.ase.ro.State.program;

import cts.ase.ro.State.clase.Masa;

public class Main {
    public static void main(String[] args) {

        Masa masa = new Masa(5);
        masa.eliberareMasa();

        masa.rezervaMasa();
        masa.rezervaMasa();

        masa.ocupaMasa();
        masa.ocupaMasa();

        masa.rezervaMasa();

        masa.eliberareMasa();
        masa.eliberareMasa();
    }
}
