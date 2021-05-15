package cts.ase.ro.Strategy.program;

import cts.ase.ro.Strategy.clase.Client;
import cts.ase.ro.Strategy.clase.PlataBonuriMasa;
import cts.ase.ro.Strategy.clase.PlataCard;
import cts.ase.ro.Strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Popescu",new PlataCard());
        client.platesteNota(200);

        client.setPlata(new PlataCash());
        client.platesteNota(550);

        client.setPlata(new PlataBonuriMasa());
        client.platesteNota(225);
    }
}
