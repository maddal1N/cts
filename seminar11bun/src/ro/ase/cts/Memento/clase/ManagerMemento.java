package ro.ase.cts.Memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<Memento> listaMemento;

    public ManagerMemento() {
        listaMemento = new ArrayList<>();
    }

    public void adaugaMemento(Memento memento){
        listaMemento.add(memento);
    }

    public Memento getLastMemento(){
        if(listaMemento.size() != 0){
            return this.listaMemento.get(this.listaMemento.size()-1);
        }
        else throw new IndexOutOfBoundsException();
    }

    public Memento getMemento(int index){
        if(index >= 0 && index < listaMemento.size()){
            return this.listaMemento.get(index);
        }
        else throw new IndexOutOfBoundsException();
    }
}
