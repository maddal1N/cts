package ro.ase.cts.clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumiriProiecte;
	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void displayStateInProject(Proiect proiect){
		StringBuilder builder = new StringBuilder();
		builder.append("Aplicantul ").append(nume).append(" ").append(prenume);
		builder.append(punctaj>proiect.getPrag() ? " a fost acceptat." : " nu a fost acceptat.");
		System.out.println(builder.toString());
		}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumiriProiecte) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumiriProiecte = denumiriProiecte;
	}
	public int getNr_proiecte() {
		return nr_proiecte;
	}

	public void setDenumiriProiecte(int nr_proiecte,String[] denumiriProiecte) {
		this.nr_proiecte = nr_proiecte;
		this.denumiriProiecte = denumiriProiecte;
	}

	public abstract float getFinantare();
}
