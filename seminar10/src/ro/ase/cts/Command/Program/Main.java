package ro.ase.cts.Command.Program;

import ro.ase.cts.Command.Clase.*;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        Executant cont = new Executant("Popescu");

        ComandaCreare comandaCreare = new ComandaCreare(cont, 222);
        managerComenzi.adaugaComanda(comandaCreare);
        managerComenzi.adaugaComanda(new ComandaRetragere(cont, 333));
        managerComenzi.executaComanda();
        managerComenzi.adaugaComanda(new ComandaDepunere(cont, 444));
        managerComenzi.adaugaComanda(new ComandaRetragere(cont, 555));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}
