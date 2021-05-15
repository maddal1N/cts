package cts.sirbu.madalin.g1086.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements ComponentaAbstracta{
    private String numePlaylist;
    private List<ComponentaAbstracta> listaComponeste = new ArrayList<>();

    public Playlist(String numePlaylist) {
        this.numePlaylist = numePlaylist;
    }

    @Override
    public void printareElement() {
        System.out.println("Sectiune " +this.numePlaylist);
        for(ComponentaAbstracta componentaAbstracta: listaComponeste)
            componentaAbstracta.printareElement();
    }

    @Override
    public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
        if(componentaAbstracta != null)
            listaComponeste.add(componentaAbstracta);
    }

    @Override
    public void stergeNod(ComponentaAbstracta componentaAbstracta) {
        if(componentaAbstracta != null)
            listaComponeste.remove(componentaAbstracta);
    }

    @Override
    public ComponentaAbstracta getNod(int pozitie) {
        if(pozitie >= 0 && pozitie < listaComponeste.size()){
            return listaComponeste.get(pozitie);
        }
        else throw new IndexOutOfBoundsException();
    }
}
