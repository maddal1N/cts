package ro.ase.cts.Observer.clase;

public class ManagerSala extends Subiect{
    private String numeSala;

    public ManagerSala(String nume) {
        this.numeSala = nume;
    }

    public void anuntaMeci(String tipMeci){
        trimiteNotificare(this.numeSala+ " va gazdui meciul de "+ tipMeci);
    }
}
