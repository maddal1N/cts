package ro.acs.cts.Command.program;

import ro.acs.cts.Command.clase.*;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        Executant executant = new Executant("Popescu");

        ComandaCreare comandaCreare = new ComandaCreare(executant,500);
        managerComenzi.adaugaComanda(comandaCreare);

        ComandaDepunere comandaDepunere = new ComandaDepunere(executant,500);
        managerComenzi.adaugaComanda(comandaDepunere);

        managerComenzi.executaComanda();

        ComandaRetragere comandaRetragere = new ComandaRetragere(executant,300);
        managerComenzi.adaugaComanda(comandaRetragere);

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();

        ComandaRetragere comandaRetragere2 = new ComandaRetragere(executant,2000);
        managerComenzi.adaugaComanda(comandaRetragere2);
        managerComenzi.executaComanda();
    }
}
