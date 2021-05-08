package ro.ase.cts.Chain.Clase;

public class ContCurent extends Cont{

    public ContCurent(float sold){
        super(sold);
    }

    @Override
    public void realizarePlata(float suma) {
        if(super.getSold() >= suma){
            System.out.println("Se realizeaza o plata din contul curent in valoare de "+suma);
            super.setSold(super.getSold()-suma);
        }else if(super.getSuccesorCont() != null){
            super.getSuccesorCont().realizarePlata(suma);
        }else{
            System.out.println("Nu se poate realiza plata!");
        }
    }
}
