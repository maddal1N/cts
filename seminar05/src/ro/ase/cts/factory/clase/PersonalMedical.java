package ro.ase.cts.factory.clase;

public abstract class PersonalMedical {
    private String nume;
    private float salariu;

    public PersonalMedical(String nume, float salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PersonalMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
