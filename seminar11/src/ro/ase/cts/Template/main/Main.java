package ro.ase.cts.Template.main;

import ro.ase.cts.Template.clase.SpectatorNormal;
import ro.ase.cts.Template.clase.SpectatorVIP;

public class Main {
    public static void main(String[] args) {
        SpectatorNormal spectatorNormal = new SpectatorNormal("Popescu");
        SpectatorVIP spectatorVIP = new SpectatorVIP("Ionescu",5);

        spectatorNormal.intraPeStadion();
        System.out.println("--------------");
        spectatorVIP.intraPeStadion();
    }
}
