package ro.ase.cts;

import ro.ase.cts.clase.Masina;
import ro.ase.cts.clase.Parlament;
import ro.ase.cts.clase.ParlamentLazy;

public class Main {
    public static void main(String[] args) {
//        Parlament parlament1 = new Parlament("Romania",123,4,"undeva");
//        Parlament parlament2 = new Parlament("Bulgaria",456,14,"In Bulgaria");

        Parlament parlament1 = Parlament.getInstance();
        Parlament parlament2 = Parlament.getInstance();

        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("-----------------------------------------------");

        parlament1.setTara("Romania");
        parlament1.setNrParlamentari(300);
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("-----------------------------------------------");

        ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Serbia",400,8,"in Serbia");
        ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("UK",500,8,"in UK");
        System.out.println(parlamentLazy1.toString());
        System.out.println(parlamentLazy2.toString());
        System.out.println("-----------------------------------------------");

        Masina masina1 = Masina.getInstace("Dacia",4,1.6f);
        Masina masina2 = Masina.getInstace("Mercedes",8,2.5f);
        System.out.println(masina1.toString());
        System.out.println(masina2.toString());
        System.out.println("-----------------------------------------------");
    }
}
