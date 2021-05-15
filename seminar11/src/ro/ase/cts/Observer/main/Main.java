package ro.ase.cts.Observer.main;

import ro.ase.cts.Observer.clase.ClientAbonat;
import ro.ase.cts.Observer.clase.ManagerSala;

public class Main {
    public static void main(String[] args) {
        ManagerSala managerSala = new ManagerSala("Arena nationala");

        ClientAbonat clientAbonat1 = new ClientAbonat("Popescu");
        ClientAbonat clientAbonat2 = new ClientAbonat("Georgescu");

        managerSala.adaugaAbonat(clientAbonat1);
        managerSala.adaugaAbonat(clientAbonat2);

        managerSala.anuntaMeci("fotbal");
        System.out.println("-------------");

        managerSala.stergeAbonat(clientAbonat1);

        managerSala.anuntaMeci("volei");
    }
}
