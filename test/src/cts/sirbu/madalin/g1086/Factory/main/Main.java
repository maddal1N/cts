package cts.sirbu.madalin.g1086.Factory.main;

import cts.sirbu.madalin.g1086.Factory.clase.Factory;
import cts.sirbu.madalin.g1086.Factory.clase.IClip;
import cts.sirbu.madalin.g1086.Factory.clase.TipVideo;
import cts.sirbu.madalin.g1086.Factory.clase.Tutorial;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        IClip tutorial1 = factory.create(TipVideo.TUTORIAL,"Tutorial cts",150);
        IClip tutorial2 = factory.create(TipVideo.TUTORIAL,"Tutorial WEB",240);
        IClip live1 = factory.create(TipVideo.LIVE,"Live gatit",30);
        IClip live2 = factory.create(TipVideo.LIVE,"Live sport",45);

        live1.start();
        tutorial1.start();
        tutorial2.stop();
        live2.pause();

        System.out.println(tutorial1);
        System.out.println(tutorial2);
        System.out.println(live1);
        System.out.println(live2);
    }
}
