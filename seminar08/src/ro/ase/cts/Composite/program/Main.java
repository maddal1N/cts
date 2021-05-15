package ro.ase.cts.Composite.program;

import ro.ase.cts.Composite.clase.Produs;
import ro.ase.cts.Composite.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Sectiune bauturi = new Sectiune("Bauturi");
        Sectiune desert = new Sectiune("Desert");

        Produs cola = new Produs("Cola");
        Produs tiramisu = new Produs("Tiramisu");
        Produs frappe = new Produs("Frappe");

        bauturi.adaugaNod(cola);
        bauturi.adaugaNod(frappe);
        desert.adaugaNod(tiramisu);

        cola.printareElement();
        desert.printareElement();
        bauturi.printareElement();

        //Mutare element dintr-o sectiune in alta (mutare din desert in bauturi)
        desert.stergeNod(tiramisu);
        bauturi.adaugaNod(tiramisu);

        Sectiune meniu = new Sectiune("Meniu");
        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(desert);
        System.out.println("---------------\n---------------");
        meniu.printareElement();

//        bauturi.getNod(2).printareElement();
    }
}
