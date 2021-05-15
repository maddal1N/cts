package cts.sirbu.madalin.g1086.Composite.main;

import cts.sirbu.madalin.g1086.Composite.clase.*;

public class Main {
    public static void main(String[] args) {
        Tutorial tutorial1 = new Tutorial("Tutorial Gatit",150);
        Tutorial tutorial2 = new Tutorial("Tutorial Sport",250);
        Tutorial tutorial3 = new Tutorial("Tutorial Gaming",350);
        Tutorial tutorial4 = new Tutorial("Tutorial CTS",550);

        Live live1 = new Live("Facebook","Live Gatit",45);
        Live live2 = new Live("Live Gatit",25);
        Live live3 = new Live("Live Gatit",35);
        Live live4 = new Live("Instagram","Live Sport",50);

        Playlist tutoriale = new Playlist("Tutoriale");
        Playlist lives = new Playlist("Live-uri");
        Playlist playlistCombinat = new Playlist("PlaylistCombinat");


        tutoriale.adaugaNod((ComponentaAbstracta) tutorial1);
        tutoriale.adaugaNod((ComponentaAbstracta) tutorial2);
        tutoriale.adaugaNod((ComponentaAbstracta) tutorial3);
        tutoriale.adaugaNod((ComponentaAbstracta) tutorial3);
        tutoriale.adaugaNod((ComponentaAbstracta) tutorial3);
        tutoriale.adaugaNod((ComponentaAbstracta) tutorial4);

        lives.adaugaNod(live1);
        lives.adaugaNod(live2);
        lives.adaugaNod(live3);
        lives.adaugaNod(live3);
        lives.adaugaNod(live3);
        lives.adaugaNod(live4);

        playlistCombinat.adaugaNod(live1);
        playlistCombinat.adaugaNod(live2);
        playlistCombinat.adaugaNod(tutorial1);
        playlistCombinat.adaugaNod(live3);
        playlistCombinat.adaugaNod(tutorial3);
        playlistCombinat.adaugaNod(tutorial2);

        System.out.println("-------------");
        tutorial1.printareElement();
        tutorial1.pause();
        lives.printareElement();
        lives.stergeNod(live1);
        System.out.println("-------------");

        Playlist playlistGeneral = new Playlist("General");
        playlistGeneral.adaugaNod(tutoriale);
        tutoriale.adaugaNod(lives);
        lives.adaugaNod(playlistCombinat);
        playlistGeneral.printareElement();
    }
}
