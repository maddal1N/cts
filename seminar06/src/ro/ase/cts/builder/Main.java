package ro.ase.cts.builder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(12,false,true,
                false,true,"rock");

        BuilderRezervare builderRezervare = new BuilderRezervare()
                .setCodRezervare(1)
                .setAreMancareInclusa(true)
                .setAreBauturaInclusa(true)
                .setAreMuzicaAmbientala(true)
                .setGenMuzical("R O C K");
        Rezervare rezervare1 = builderRezervare.build();

        Rezervare rezervare2  = new BuilderRezervare()
                .setCodRezervare(2)
                .setAreBauturaInclusa(false)
                .setAreMuzicaAmbientala(true)
                .setGenMuzical("gen2").build();

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
        System.out.println("-----------");

        Rezervare rezervare4=builderRezervare.setCodRezervare(4).build(); //!! shallow copy

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
        System.out.println(rezervare4.toString());

        //Varianta 2
        System.out.println("varianta 2");
        BuilderRezervareV2 builderRezervareV2 = new BuilderRezervareV2().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);

        Rezervare rez1 =builderRezervareV2.setCodRezervare(10).build();
        Rezervare rez2 =builderRezervareV2.setCodRezervare(15).build();
        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}
