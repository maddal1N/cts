package ro.ase.cts.factory.clase;

public class Medic extends PersonalMedical{

    public Medic(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Medic{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
