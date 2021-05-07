package ro.ase.cts.AdapterObiecte.program;

import ro.ase.cts.AdapterObiecte.clase.Aplicant;
import ro.ase.cts.AdapterObiecte.clase.Proiect;
import ro.ase.cts.AdapterObiecte.clase.readers.ElevReader;
import ro.ase.cts.AdapterObiecte.clase.readers.Readable;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> citesteAplicanti(Readable reader) throws FileNotFoundException{
//		List<Aplicant> listaAplicanti = reader.readAplicanti(numeFisier);
//		return listaAplicanti;

		return reader.readAplicanti();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new ElevReader("seminar02/elevi.txt"));
			Proiect proiect1 = new Proiect(80);
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getFinantare());
				aplicant.displayStateInProject(proiect1);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
