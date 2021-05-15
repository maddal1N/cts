package ro.ase.cts.Observer.clase;

public class ClientAbonat implements Observer{
    private String nume;

    public ClientAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Clientul a receptionat mesajul: " + mesaj);
    }
}
