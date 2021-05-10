package ro.ase.cts.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaAbstracta{
    private String numeSectiune;
    private List<ComponentaAbstracta> listaComponeste = new ArrayList<>();

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void printareElement() {
        System.out.println("Sectiune " +this.numeSectiune);
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
