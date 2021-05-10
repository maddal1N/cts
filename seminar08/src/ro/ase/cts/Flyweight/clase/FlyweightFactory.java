package ro.ase.cts.Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,FlyweightAbstract> clienti;

    public FlyweightFactory() {
        clienti = new HashMap<>();
    }

    public FlyweightAbstract getClient(String nrTelefon){
        FlyweightAbstract client = clienti.get(nrTelefon);

        if(client == null) {
            client = new Client("Popescu", nrTelefon, "abcd@gmail.com");
            clienti.put(nrTelefon, client);
        }

        return client;
    }
}
