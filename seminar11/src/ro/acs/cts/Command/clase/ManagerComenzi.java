package ro.acs.cts.Command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<ComandaAbstracta> listaComenzi = new ArrayList<>();

    public void adaugaComanda(ComandaAbstracta comanda){
        this.listaComenzi.add(comanda);
    }

    public void executaComanda(){
        if(this.listaComenzi.size() != 0){
            this.listaComenzi.get(0).executa();
            this.listaComenzi.remove(0);
        }
        else throw new IndexOutOfBoundsException();
    }
}
