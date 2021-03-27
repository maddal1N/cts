package ro.ase.cts.factory.clase;

public class FactorySingleton {
    private static FactorySingleton instanta = null;

    public synchronized static FactorySingleton getInstance(){
        if(instanta == null){
            instanta = new FactorySingleton();
        }
        return instanta;
    }

    //pentru singleton
    private FactorySingleton() {
    }

    public PersonalMedical create(TipPersonal tip, String nume, float salariu){
        switch (tip){
            case MEDIC:{
                Medic medic = new Medic(nume,salariu);
                return medic;
            }
            case ASISTENT:{
                Asistent asistent = new Asistent(nume,salariu);
                return asistent;
            }
            case BRANCARDIER:{
                Brancardier brancardier = new Brancardier(nume,salariu);
                return brancardier;
            }
            default: throw new IllegalArgumentException("Tipul nu este corect.");
        }
    }
}
