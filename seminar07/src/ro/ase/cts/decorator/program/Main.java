package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorConcret;
import ro.ase.cts.decorator.clase.DecoratorConcretTelefon;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Ionescu");
        card.platestePOS();
        card.platesteOnline();

        System.out.println("--------------contactless--------------");
        DecoratorConcret decoratorConcret=new DecoratorConcret(card);
        decoratorConcret.platesteContactless();
        decoratorConcret.platestePOS();

        System.out.println("--------------contactless cu telefonul--------------");
        DecoratorConcretTelefon decoratorConcretTelefon=new DecoratorConcretTelefon(card);
        decoratorConcretTelefon.platesteContactless();
        decoratorConcretTelefon.platestePOS();
    }
}
