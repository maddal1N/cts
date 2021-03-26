package ro.ase.cts.program;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.AngajatReader;
import ro.ase.cts.clase.readers.ElevReader;
import ro.ase.cts.clase.readers.Readable;
import ro.ase.cts.clase.readers.StudentReader;

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
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
