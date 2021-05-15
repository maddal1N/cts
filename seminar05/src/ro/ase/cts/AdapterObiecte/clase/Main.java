package ro.ase.cts.AdapterObiecte.clase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> denumiri = new ArrayList<>();
        denumiri.add("apa");
        List<Integer> cantitati = new ArrayList<>();
        cantitati.add(10);
        Retata retata1 = new Retata(denumiri,cantitati);

        Retata retata2 = (Retata) retata1.copiaza();

//        List<Integer> cantitati2 = new ArrayList<>();
//        cantitati2.add(50);
//        cantitati2.add(23);
//        cantitati2.add(45);
//        retata2.setCantitati(cantitati2);


        System.out.println(retata1);
        System.out.println(retata2);
    }
}
