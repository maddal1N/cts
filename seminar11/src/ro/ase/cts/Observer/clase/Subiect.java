package ro.ase.cts.Observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer> listaObserveri;

    public Subiect() {
        listaObserveri = new ArrayList<>();
    }

    public void adaugaAbonat(Observer observer){
        listaObserveri.add(observer);
    }
    public void stergeAbonat(Observer observer){
        listaObserveri.remove(observer);
    }
    public void trimiteNotificare(String mesaj){
        for (Observer observer:listaObserveri) {
            observer.receptionareMesaj(mesaj);
        }
    }
}
