package ro.ase.cts.AdapterObiecte.clase.readers;

import ro.ase.cts.AdapterObiecte.clase.Aplicant;
import ro.ase.cts.AdapterObiecte.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends Readable{

    public ElevReader(String numeFisier) {
        super(numeFisier);
    }

    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.numeFisier));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input2.hasNext()) {
            Elev elev = new Elev();
            super.readAplicant(input2,elev);

            int clasa = input2.nextInt();
            String tutore = input2.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        input2.close();
        return elevi;
    }
}
