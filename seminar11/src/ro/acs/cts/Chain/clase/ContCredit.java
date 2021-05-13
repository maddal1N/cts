package ro.acs.cts.Chain.clase;

public class ContCredit extends Cont{
    public ContCredit(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlata(float suma) {
        if(suma <= super.getSold()){
            System.out.println("S-a realizat plata din contul de credit in valoare de "+suma);
            super.setSold(getSold()-suma);
        }
        else if(super.getSuccesorCont() != null){
            super.getSuccesorCont().realizeazaPlata(suma);
        }
        else{
            System.out.println("Nu se poate realiza plata");
        }
    }
}
