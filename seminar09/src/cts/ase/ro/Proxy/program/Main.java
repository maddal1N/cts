package cts.ase.ro.Proxy.program;

import cts.ase.ro.Proxy.clase.ManagerRezervari;
import cts.ase.ro.Proxy.clase.ProxyManager;

public class Main {
    public static void main(String[] args) {
        ManagerRezervari managerRezervari=new ManagerRezervari("Local1");
        managerRezervari.rezerva(2);
        System.out.println("-------------------");

        ProxyManager proxyManager = new ProxyManager(managerRezervari,4);
        proxyManager.rezerva(2);
        proxyManager.rezerva(4);
        proxyManager.rezerva(10);
    }
}
