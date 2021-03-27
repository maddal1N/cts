package ro.ase.cts.factory.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Brancardier{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
