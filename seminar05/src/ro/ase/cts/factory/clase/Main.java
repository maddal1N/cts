package ro.ase.cts.factory.clase;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        PersonalMedical medic1 = factory.create(TipPersonal.MEDIC,"Ionescu",5000);
        PersonalMedical asistent1 = factory.create(TipPersonal.ASISTENT,"Popescu",2000);

        System.out.println(medic1);
        System.out.println(asistent1);
        System.out.println("-------------------");

        PersonalMedical medic2 =FactorySingleton.getInstance().create(TipPersonal.MEDIC,"Ionescu2",5000);
        PersonalMedical asistent2 =FactorySingleton.getInstance().create(TipPersonal.ASISTENT,"Popescu2",2000);
        System.out.println(medic2);
        System.out.println(asistent2);
    }
}
