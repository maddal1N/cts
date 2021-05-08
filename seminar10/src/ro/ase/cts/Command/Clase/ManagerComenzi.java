package ro.ase.cts.Command.Clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
//    este o coada
    private List<ComandaAbstracta> listaComenzi = new ArrayList<>();

    public void adaugaComanda(ComandaAbstracta comandaNoua){
        this.listaComenzi.add(comandaNoua);
    }

    public void executaComanda(){
        if(!listaComenzi.isEmpty()){
            this.listaComenzi.get(0).executa();
            this.listaComenzi.remove(0);
        }else{
            throw new IndexOutOfBoundsException();
        }
    }
}
