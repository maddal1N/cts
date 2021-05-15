package cts.sirbu.madalin.g1086.Decorator.clase;

import cts.sirbu.madalin.g1086.Factory.clase.IClip;

public class DecoratorReclama extends DecoratorAbstract{
    private int durataReclama;

    public DecoratorReclama(IClip clip, int durataReclama) {
        super(clip);
        this.durataReclama = durataReclama;
    }

    @Override
    public void rulareReclama() {
        System.out.println("Va fi rulata o reclama pentru " + this.durataReclama+" secunde");
    }
}
