package ro.ase.cts.Flyweight.program;

import ro.ase.cts.Flyweight.clase.Client;
import ro.ase.cts.Flyweight.clase.FlyweightFactory;
import ro.ase.cts.Flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1,5);
        Rezervare rezervare2 = new Rezervare(2,7);
        Rezervare rezervare3 = new Rezervare(3,9);

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getClient("077328181").printeazaRezervare(rezervare1);
        flyweightFactory.getClient("077321441").printeazaRezervare(rezervare2);
        flyweightFactory.getClient("077321441").printeazaRezervare(rezervare3);
    }
}
