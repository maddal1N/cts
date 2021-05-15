package cts.sirbu.madalin.g1086.Decorator.Main;

import cts.sirbu.madalin.g1086.Decorator.clase.DecoratorReclama;
import cts.sirbu.madalin.g1086.Factory.clase.Live;
import cts.sirbu.madalin.g1086.Factory.clase.Tutorial;

public class Main {
    public static void main(String[] args) {
        Live live = new Live("Facebook","Live sport",50);
        live.pause();
        live.stop();
        Tutorial tutorial = new Tutorial("Tutorial CTS",80);
        tutorial.pause();
        tutorial.resume();
        System.out.println("----------------");

        DecoratorReclama decoratorReclama = new DecoratorReclama(tutorial,30);
        decoratorReclama.pause();
        decoratorReclama.rulareReclama();
        decoratorReclama.resume();

        System.out.println("----------------");

        DecoratorReclama decoratorReclama2 = new DecoratorReclama(live,20);
        decoratorReclama2.rulareReclama();
        decoratorReclama2.stop();
    }
}
