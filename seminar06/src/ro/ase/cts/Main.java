package ro.ase.cts;

public class Main {

    public static void afiseazaInformatiiJucator(FabricaJucatori fabrica, String nume, int nrTricou){
        Jucator jucator = fabrica.creazaJucator(nume,nrTricou);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        afiseazaInformatiiJucator(new FabricaAtacant(),"Popescu",15);
        afiseazaInformatiiJucator(new FabricaPortar(),"Ionescu",17);
        afiseazaInformatiiJucator(new FabricaMijlocas(),"Georgescu",11);
    }
}
